import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dx[] = {0,1,0,-1};
		int dy[] = {-1,0,1,0};
		boolean pass[] = {true,false,true,false};

		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(w == 0 && h == 0) break;
			int d = sc.nextInt();

			HashMap<Point,Integer> node = new HashMap<Point,Integer>();
			int ns = sc.nextInt();
			for(int i=0;i<ns;i++){
				node.put(toPoint(sc.next()),sc.nextInt());
			}

			HashMap<Point,HashMap<Point,Integer>> edge = new HashMap<Point,HashMap<Point,Integer>>();
			int nc = sc.nextInt();
			for(int i=0;i<nc;i++){
				Point a = toPoint(sc.next());
				Point b = toPoint(sc.next());
				if(edge.get(a) == null) edge.put(a,new HashMap<Point,Integer>());
				if(edge.get(b) == null) edge.put(b,new HashMap<Point,Integer>());
				edge.get(a).put(b,-1);
				edge.get(b).put(a,-1);
			}

			int nj = sc.nextInt();
			for(int i=0;i<nj;i++){
				Point a = toPoint(sc.next());
				Point b = toPoint(sc.next());
				int cost = sc.nextInt();
				if(edge.get(a) == null) edge.put(a,new HashMap<Point,Integer>());
				if(edge.get(b) == null) edge.put(b,new HashMap<Point,Integer>());
				edge.get(a).put(b,cost);
				edge.get(b).put(a,cost);
			}

			Point start = toPoint(sc.next());
			Point goal = toPoint(sc.next());

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			open.add(new State(start,1,0));
			closed.add(new State(start,1,0));
			State ans = null;

			while(!open.isEmpty()){
				State st = open.poll();

				if(st.p.equals(goal)){
					ans = st;
					break;
				}

				for(int i=0;i<4;i++){
					//U^[µÄÍ¢¯È¢
					if((st.d + 2) % 4 == i) continue;

					Point np = new Point(st.p.x + dx[i], st.p.y + dy[i]);

					if(np.x>=0 && np.x<w && np.y>=0 && np.y<h){
						int val = 0;
						//st.p©çnpÖÌ¹îñðæèo·
						if(edge.containsKey(st.p) &&
							 edge.get(st.p).containsKey(np)) val = edge.get(st.p).get(np);
						//HÈçÊêÈ¢
						if(val == -1) continue;

						int ncost = st.cost + d + val;

						//Mª éêÌ
						if(node.containsKey(np)){
							int k = node.get(np);
							boolean flg = pass[i]; //true:Ú®Â\Å é
							int div = ncost / k;
							if(div % 2 == 1) flg = !flg;
							if(!flg) continue;
						}

						State nst = new State(np,i,ncost);
						if(closed.contains(nst)) continue;
						closed.add(nst);
						open.add(nst);
					}
				}
			}

			System.out.println(ans.cost);
		}
	}

	private static Point toPoint(String s){
		String[] tmp = s.split("-");
		int x = Integer.parseInt(tmp[1]) - 1;
		int y = tmp[0].charAt(0) - 'a';
		return new Point(x,y);
	}
}

class State implements Comparable<State>{
	Point p;
	int d,cost;

	State(Point p,int d,int cost){
		this.p = new Point(p.x,p.y);
		this.d = d;
		this.cost = cost;
	}

	public int compareTo(State st){
		return this.cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return p.equals(st.p) && d == st.d;
	}

	public int hashCode(){
		return p.x + p.y * 100 + d * 10000;
	}

	public String toString(){
		return String.format("[(%d,%d),%d,%d]",p.x,p.y,d,cost);
	}
}
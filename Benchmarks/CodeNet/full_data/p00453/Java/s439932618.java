import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			ArrayList<ArrayList<Point>> map = new ArrayList<ArrayList<Point>>();
			for(int i=0;i<n;i++){
				ArrayList<Point> tmp = new ArrayList<Point>();
				int k = sc.nextInt();
				for(int j=0;j<k;j++){
					tmp.add(new Point(sc.nextInt()-1,sc.nextInt()));
				}
				map.add(tmp);
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			for(int i=0;i<2;i++){
				if(m < i) continue;
				for(Point p : map.get(i)){
					State nst = new State(p.x,i,p.y,m-i,0);
					open.add(nst);
				}
			}

			State ans = null;

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.y == n){
					ans = st;
					break;
				}

				open.addAll(st.nexts(map));
			}

			System.out.println(ans.cost);
		}
	}
}

class State implements Comparable<State>{
	int x,y,d,rem,cost;

	State(int x,int y,int d,int rem,int cost){
		this.x = x;
		this.y = y;
		this.d = d;
		this.rem = rem;
		this.cost = cost;
	}

	public List<State> nexts(ArrayList<ArrayList<Point>> map){
		List<State> sts = new ArrayList<State>();

		for(int i=1;i<=2;i++){
			//ツ古シツつアツつ、ツ甘敖づ可づつつ「ツつス
			if(y + i >= map.size()){
				//1ツ行ツづづ篠つオツづつォツづ按つ「ツ湘ェツ債暗按外ツづづ猟づゥ
				if(i == 1 || i == 2 && rem > 0){
					sts.add(new State(0,map.size(),0,0,cost));
				}
				continue;
			}

			//1ツ行ツづづ篠つオツづつォツづ按つ「ツつゥツづァツ終ツ猟ケ
			if(i == 2 && rem == 0) break;

			for(Point p : map.get(y+i)){
				sts.add(new State(p.x,y+i,p.y,rem-(i-1),cost+(d+p.y)*Math.abs(x-p.x)));
			}
		}

		return sts;
	}

	public int compareTo(State st){
		return this.cost - st.cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return x == st.x && y == st.y && rem == st.rem;
	}

	public int hashCode(){
		return rem * 1000000 + x * 1000 + y;
	}

	public String toString(){
		return String.format("[(%d,%d),c:%d,r:%d]",x,y,cost,rem);
	}
}
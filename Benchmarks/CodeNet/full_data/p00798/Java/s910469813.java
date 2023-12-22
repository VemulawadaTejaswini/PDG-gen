import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;

			t = new int[h][w];
			Point p = null;
			Point b = null;

			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					t[i][j] = sc.nextInt();
					if(t[i][j] == 4){
						p = new Point(j,i);
						t[i][j] = 0;
					}
					else if(t[i][j] == 2){
						b = new Point(j,i);
						t[i][j] = 0;
					}
				}
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			State ans = null;
			open.add(new State(p,b,0));

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(t[st.b.y][st.b.x] == 3){
					ans = st;
					break;
				}

				open.addAll(st.nexts());
			}

			System.out.println(ans == null ? -1 : ans.cost);
		}
	}

	private static int w,h;
	private static int[][] t;
	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {-1,0,1,0};

	private static boolean reachable(Point s,Point g,Point b){
		t[b.y][b.x] = 2;

		Queue<Point> open = new LinkedList<Point>();
		HashSet<Point> closed = new HashSet<Point>();
		open.add(s);

		while(!open.isEmpty()){
			Point p = open.poll();
			if(closed.contains(p)) continue;
			closed.add(p);
			if(p.equals(g)){
				t[b.y][b.x] = 0;
				return true;
			}

			for(int i=0;i<4;i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if(nx>=0 && nx<w && ny>=0 && ny<h && (t[ny][nx]==0 || t[ny][nx]==3)){
					open.add(new Point(nx,ny));
				}
			}
		}

		t[b.y][b.x] = 0;

		return false;
	}

	private static class State implements Comparable<State>{
		Point p,b;
		int cost;

		State(Point p,Point b,int cost){
			this.p = new Point(p.x,p.y);
			this.b = new Point(b.x,b.y);
			this.cost = cost;
		}

		List<State> nexts(){
			List<State> sts = new ArrayList<State>();

			for(int i=0;i<4;i++){
				int nx1 = b.x + dx[i];
				int ny1 = b.y + dy[i];
				int nx2 = b.x + dx[(i+2)%4];
				int ny2 = b.y + dy[(i+2)%4];
				Point np1 = new Point(nx1,ny1);
				Point np2 = new Point(nx2,ny2);

				if(nx1>=0 && nx1<w && ny1>=0 && ny1<h &&
					 nx2>=0 && nx2<w && ny2>=0 && ny2<h &&
					 t[ny1][nx1]!=1 && t[ny2][nx2]!=1 && reachable(p,np1,b)){
					sts.add(new State(b,np2,cost+1));
				}
			}

			return sts;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return p.equals(st.p) && b.equals(st.b);
		}

		public int hashCode(){
			return p.x + p.y * 10 + b.x * 100 + b.y * 1000;
		}

		public int compareTo(State st){
			return this.cost - st.cost;
		}
	}
}
import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;

			Point start = null;
			map = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j] == 2) start = new Point(j,i);
				}
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			State ans = null;
			open.add(new State(start,6,0));

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(map[st.p.y][st.p.x] == 3){
					ans = st;
					break;
				}

				open.addAll(st.nexts());
			}

			System.out.println(ans==null ? -1 : ans.cost);
		}
	}

	private static int w;
	private static int h;
	private static int[][] map;
	private static int dx[] = {0,1,0,-1};
	private static int dy[] = {-1,0,1,0};

	private static class State implements Comparable<State>{
		Point p;
		int hp,cost;

		State(Point p,int hp,int cost){
			this.p = new Point(p.x,p.y);
			this.hp = hp;
			this.cost = cost;
		}

		List<State> nexts(){
			List<State> sts = new ArrayList<State>();

			for(int i=0;i<4;i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if(nx>=0 && nx<w && ny>=0 && ny<h && map[ny][nx]!=0 && hp-1>0){
					int nhp = (map[ny][nx]==4 ? 6 : hp-1);
					sts.add(new State(new Point(nx,ny),nhp,cost+1));
				}
			}

			return sts;
		}

		public int compareTo(State st){
			return this.cost - st.cost;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return st.p.equals(p) && st.hp == hp;
		}

		public int hashCode(){
			return p.x + p.y * 10 + hp * 100;
		}
	}
}
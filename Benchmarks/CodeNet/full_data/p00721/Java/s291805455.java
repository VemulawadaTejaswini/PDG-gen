import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;

			t = new char[h][w];

			trash = new HashMap<Point,Integer>();
			int count = 1;

			for(int i=0;i<h;i++){
				t[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(t[i][j] == 'o'){
						trash.put(new Point(j,i),0);
					}
					else if(t[i][j] == '*'){
						trash.put(new Point(j,i),count++);
					}
				}
			}

			map = new int[count][count];
			for(int[] tmp : map) Arrays.fill(tmp,-1);
			for(Point start : trash.keySet()){
				setMinCost(start);
			}

			ans = Integer.MAX_VALUE;
			solve(new boolean[count],0,0,count-1);
			System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
		}
	}

	private static HashMap<Point,Integer> trash;
	private static int[][] map;
	private static char[][] t;
	private static int dx[] = {0,0,1,-1};
	private static int dy[] = {1,-1,0,0};
	private static int ans;

	private static void solve(boolean[] used,int now,int cost,int rem){
		if(rem == 0){
			ans = Math.min(ans,cost);
			return;
		}

		used[now] = true;
		for(int i=1;i<map.length;i++){
			if(map[now][i] != -1 && !used[i]){
				solve(used,i,cost+map[now][i],rem-1);
			}
		}
		used[now] = false;

		return;
	}

	private static void setMinCost(Point p){
		PriorityQueue<State> open = new PriorityQueue<State>();
		HashSet<State> closed = new HashSet<State>();

		open.add(new State(p,0));

		while(!open.isEmpty()){
			State st = open.poll();
			if(closed.contains(st)) continue;
			closed.add(st);

			Point tmp = st.p;

			if(t[tmp.y][tmp.x] == 'o' || t[tmp.y][tmp.x] == '*'){
				map[trash.get(p)][trash.get(tmp)] = st.cost;
			}

			open.addAll(st.nexts());
		}
	}

	private static class State implements Comparable<State>{
		Point p;
		int cost;

		State(Point p,int cost){
			this.p = new Point(p.x,p.y);
			this.cost = cost;
		}

		List<State> nexts(){
			List<State> sts = new ArrayList<State>();

			for(int i=0;i<4;i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if(nx >= 0 && nx < t[0].length && ny >= 0 && ny < t.length && t[ny][nx] != 'x'){
					sts.add(new State(new Point(nx,ny),cost+1));
				}
			}

			return sts;
		}

		public int compareTo(State st){
			return this.cost - st.cost;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return p.x == st.p.x && p.y == st.p.y;
		}

		public int hashCode(){
			return p.x + 1000 * p.y;
		}
	}
}
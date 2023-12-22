import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;

			int[][] map = new int[h*2-1][w*2+1];

			for(int i=0;i<h*2-1;i++){
				if(i % 2 == 0){ //c_ÌÇ
					map[i][0] = 1;
					for(int j=0;j<w-1;j++){
						map[i][j*2+1] = 0;
						map[i][j*2+2] = sc.nextInt() == 1 ? 1 : 0;
					}
					map[i][w*2-1] = 0;
					map[i][w*2] = 1;
				}
				else{ //¡_ÌÇ
					for(int j=0;j<w;j++){
						map[i][j*2] = 1;
						map[i][j*2+1] = sc.nextInt() == 1 ? 1 : 0;
					}
					map[i][w*2] = 1;
				}
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			State st = new State(1,0,0);
			open.add(st);
			State ans = null;

			while(!open.isEmpty()){
				st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.x == w*2-1 && st.y == h*2-2){
					ans = st;
					break;
				}

				open.addAll(st.nexts(map));
			}

			System.out.println(ans == null ? 0 : ans.cost+1);
		}
	}
}

class State implements Comparable<State>{
	int x,y;
	int cost;

	State(int x,int y,int cost){
		this.x = x;
		this.y = y;
		this.cost = cost;
	}

	public List<State> nexts(int[][] map){
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,1,-1};
		List<State> sts = new ArrayList<State>();

		for(int i=0;i<4;i++){
			int nx = x + 2*dx[i];
			int ny = y + 2*dy[i];
			int tx = x + dx[i];
			int ty = y + dy[i];

			if(nx>=0 && nx<map[0].length && ny>=0 && ny<map.length && map[ty][tx]==0 && map[ny][nx]==0){
				sts.add(new State(nx,ny,cost+1));
			}
		}

		return sts;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return st.x == x && st.y == y;
	}

	public int hashCode(){
		return x * 10000 + y;
	}

	public int compareTo(State st){
		return this.cost - st.cost;
	}
}
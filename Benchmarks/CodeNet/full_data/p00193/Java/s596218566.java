import java.util.*;

public class Main {
	//1251
	Scanner sc = new Scanner(System.in);
	int INF = 1 << 24;
	int [][] field;
	int [][] vx = {{0,1,0,-1,-1,-1},{0,1,0,-1,1,1}};
	int [][] vy = {{1,0,-1,0,1,-1 },{1,0,-1,0,-1,1}};
	int n,m;
	
	class C{
		int x,y, step;

		public C(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}

	private void doit() {
		while(true){
			n = sc.nextInt();
			if(n== 0)break;
			m = sc.nextInt();
			int s = sc.nextInt();
			field = new int[n][m];
			for(int i = 0; i < n; i++){
				Arrays.fill(field[i], INF);
			}
			for(int i = 0; i < s; i++){
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				bfs(x,y);
			}
			int t = sc.nextInt();
			int [][] work = deepcopy(field);
			int max = 0;
			for(int i = 0; i < t; i++){
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				field = deepcopy(work);
				int res = bfs(x,y);
				max = Math.max(max, res);
			}
			System.out.println(max);
		}
	}

	private int[][] deepcopy(int[][] field2) {
		int [][] res = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				res[i][j] = field2[i][j];
			}
		}
		return res;
	}

	private int bfs(int x, int y) {
		LinkedList<C> open = new LinkedList<Main.C>();
		open.add(new C(x, y, 0));
		field[y][x] = 0;
		int ans = 1;
		while(! open.isEmpty()){
			C now = open.poll();
			int ind = now.y % 2;
			for(int i = 0; i < vx[ind].length; i++){
				int xx = now.x + vx[ind][i];
				int yy = now.y + vy[ind][i];
				if(! isOK(xx,yy)) continue;
				if(field[yy][xx] <= now.step + 1) continue;
				open.add(new C(xx, yy, now.step + 1));
				field[yy][xx] = now.step + 1;
				ans++;
			}
		}
		return ans;
	}

	private boolean isOK(int xx, int yy) {
		if(0<= xx && xx < m && 0<= yy && yy < n){
			return true;
		}
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{

//	class L implements Comparable<L>{
//		int t, x, y;
//		public L(int t, int x, int y) {
//			this.t = t;
//			this.x = x;
//			this.y = y;
//		}
//		public int compareTo(L o) {
//			return t-o.t;
//		}
//	}
	
	class Tank{
		List<int[]> pos;
		double height;
		int id, edge;
		public Tank(int id) {
			this.id = id;
			height = 0;
			pos = new ArrayList<int[]>();
		}
		void add(int pi, int pj){
			pos.add(new int[]{pi, pj});
			edge = 0;
			for(int[] a:pos){
				for(int k=0;k<4;k++){
					int ni = a[0]+move[k][0];
					int nj = a[1]+move[k][1];
					if(0<=ni&&ni<h&&0<=nj&&nj<w){
						if(map[ni][nj]<map[a[0]][a[1]])edge++;
					}
					else edge++;
				}
			}
		}
		void f(double V){
//			System.out.println("Given V:" + V + " ID:" + id + " MaxV:" + 30*30*pos.size() + " Now:" + height + " E:" +edge);
//			System.out.println("V:" + V + " size:" + pos.size());
			double vh = V/30/30/pos.size();
			double dh = 30-height;
			double mh = Math.min(vh, dh);
//			System.out.println("vh:" + vh + " dh:" + dh);
			height+=mh;
//			System.out.println("Increase h:" + Math.min(vh, dh));
			vh-=mh;
			if(vh<EPS)return;
			double giveV = vh*30*30*pos.size()/edge;
			if(giveV<EPS)return;
//			System.out.println("Tank: " + id + " is full." + giveV);
			for(int[]a:pos)for(int k=0;k<4;k++){
				int ni = a[0]+move[k][0];
				int nj = a[1]+move[k][1];
				if(0<=ni&&ni<h&&0<=nj&&nj<w&&map[ni][nj]<map[a[0]][a[1]]&&tanks[ni][nj]!=0){
//					System.out.println("From:" + id + " To:" + tanks[ni][nj]);
					ref.get(tanks[ni][nj]).f(giveV);
				}
			}
		}
	}
	
	int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
	int w, h, fi, fj, q;
	int[][] map, tanks;
	Map<Integer, Tank> ref;
	boolean[][] u;
	double EPS = 1e-8;
	
	void union(int i, int j, int id, int H){
		for(int k=0;k<4;k++){
			int ni = i+move[k][0];
			int nj = j+move[k][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&!u[ni][nj]&&map[ni][nj]==H){
				Tank t = ref.get(id);
				t.add(ni, nj);
				ref.put(id, t);
				u[ni][nj] = true;
				tanks[ni][nj] = id;
				union(ni, nj, id, H);
			}
		}
	}
	
	void flow(int t){
		double fq = t*q;
		ref.get(tanks[fi][fj]).f(fq);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			fj = sc.nextInt(); fi = sc.nextInt(); q = sc.nextInt();
			map = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)map[i][j] = sc.nextInt();
			ref = new HashMap<Integer, Tank>();
			tanks = new int[h][w];
			u = new boolean[h][w];
			int id = 1;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				if(map[i][j]==0||u[i][j])continue;
				Tank t = new Tank(id);
				t.add(i, j);
				tanks[i][j] = id;
				ref.put(id, t);
				u[i][j] = true;
				union(i, j, id, map[i][j]);
				id++;
			}
//			debug(tanks);
			int L = sc.nextInt();
			int t = 0;
			while(L--!=0){
				int time = sc.nextInt();
				int pj = sc.nextInt(), pi = sc.nextInt();
				flow(time-t);
				t = time;
				System.out.println((int)ref.get(tanks[pi][pj]).height);
			}
		}
	}
	
	void debug(Object...o){
		System.err.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
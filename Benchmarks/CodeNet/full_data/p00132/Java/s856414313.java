import java.util.Arrays;
import java.util.Scanner;

//Jigsaw Puzzle
public class Main{

	int h, w, n, N;
	int[] piece;
	R[] rs;
	P[][] ps;
	boolean[] u;
	
	boolean dfs(int k){
//		System.out.println("K: " + k);
//		debug(piece);
		if(k==N)return true;
		for(int d=0;d<4;d++){
			for(int i=0;i+ps[k][d].H<=h;i++)for(int j=0;j+ps[k][d].W<=w;j++){
				if(match(i, j, ps[k][d])){
					int f = w - (j+ps[k][d].W);
					for(int y=0;y<ps[k][d].H;y++){
						piece[i+y] -= ps[k][d].p[y]<<f;
					}
					if(dfs(k+1))return true;
					for(int y=0;y<ps[k][d].H;y++){
						piece[i+y] += ps[k][d].p[y]<<f;
					}
				}
			}
		}
		return false;
	}
	
	char[][] copy(int H, int W, char[][] m){
		char[][] res = new char[H][W];
		for(int i=0;i<H;i++)for(int j=0;j<W;j++)res[i][j] = m[i][j];
		return res;
	}
	
	class R implements Comparable<R>{
		int H, W, id;
		char[][] m;
		int c;
		public R(int H, int W, char[][] m, int c, int id) {
			this.H = H; this.W = W;
			this.id = id+1;
			this.c = c;
			this.m = new char[H][W];
			for(int i=0;i<H;i++)for(int j=0;j<W;j++)this.m[i][j] = m[i][j];
		}
		P[] get(){
//			System.out.println("h:"+H+" w:"+W);
			P[] res = new P[4];
			res[0] = new P(H, W, m);
//			System.out.println("H*"+H+" W:"+W);
			char[][] tmp = copy(H, W, m);
			for(int k=1;k<4;k++){
				int ph = res[k-1].H, pw = res[k-1].W;
//				System.out.println("H:"+ph+" W:"+pw);
				tmp = rotate(tmp, ph, pw);
				res[k] = new P(pw, ph, tmp);
			}
			return res;
		}
		public int compareTo(R o) {
			return o.c-c;
		}
		@Override
		public String toString() {
//			System.out.println("H:"+H+" W:"+W);
//			System.out.println("RH:"+m.length+" RW:"+m[0].length);
			String r =  H+","+W+"\n";
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++)r+=m[i][j];
				r+="\n";
			}
			return r;
		}
	}
	class P{
		int H, W;
		int[] p;
		public P(int H, int W, char[][] m) {
			this.H = H; this.W = W;
//			debug(m);
			p = new int[H];
			for(int i=0;i<H;i++)for(int j=0;j<W;j++){
				p[i]<<=1; p[i]+=m[i][j]=='#'?1:0;
			}
		}
	}
	
	boolean match(int i, int j, P p){
		int f = w-(j+p.W);
		for(int y=0;y<p.H;y++)if((piece[i+y]&(p.p[y]<<f))!=(p.p[y]<<f))return false;
		return true;
	}
	
	char[][] rotate(char[][] m, int h, int w){
		char[][] r = new char[w][h];
		for(int i=0;i<w;i++)for(int j=0;j<h;j++)r[i][j]=m[h-j-1][i];
		return r;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			h = sc.nextInt(); w = sc.nextInt();
			if((h|w)==0)break;
			piece = new int[h];
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++)map[i]=sc.next().toCharArray();
			int num = 0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				num += map[i][j]=='.'?1:0;
				piece[i]<<=1; piece[i]+=map[i][j]=='.'?1:0;
			}
//			debug(piece);
			n = sc.nextInt();
			rs = new R[n];
			for(int k=0;k<n;k++){
				int H = sc.nextInt(), W = sc.nextInt();
				char[][] m = new char[H][W];
				for(int i=0;i<H;i++)m[i]=sc.next().toCharArray();
				int c = 0;
				for(int i=0;i<H;i++)for(int j=0;j<W;j++)c+=m[i][j]=='#'?1:0;
				rs[k] = new R(H, W, m, c, k);
			}
			int[] t = new int[h];
			for(int i=0;i<h;i++)t[i]=piece[i];
			int K = sc.nextInt();
			while(K--!=0){
				N = sc.nextInt();
				R[] r = new R[N];
				for(int i=0;i<N;i++)r[i] = rs[sc.nextInt()-1];
//				debug(r);
				int sum = 0;
				for(int i=0;i<N;i++)sum+=r[i].c;
				if(sum!=num){
					System.out.println("NO"); continue;
				}
				Arrays.sort(r);
				ps = new P[N][4];
				for(int i=0;i<N;i++){
//					System.out.println("P:"+r[i].id+" h:"+r[i].H+" w:"+r[i].W);
//					debug(r[i].m);
					ps[i] = r[i].get();
//					for(int k=0;k<4;k++)System.out.println(ps[i][k].H+" "+ps[i][k].W);
				}
				for(int i=0;i<h;i++)piece[i]=t[i];
				System.out.println(dfs(0)?"YES":"NO");
			}
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
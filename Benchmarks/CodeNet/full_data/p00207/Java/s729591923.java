import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main{
	static int[][] ban;
	static int[][] visited;
	static int[] xv= {0,1,0,-1};
	static int[] yv= {1,0,-1,0};
	static int w,h,sx,sy,gx,gy;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			w=sc.nextInt();
			h=sc.nextInt();
			if(h*w==0) {
				break;
			}
			sx=sc.nextInt();
			sy=sc.nextInt();
			gx=sc.nextInt();
			gy=sc.nextInt();
			ban=new int[h+2][w+2];
			visited=new int[h+2][w+2];
			for(int i=0; i<=h+1; i++) {
				for(int j=0; j<=w+1; j++) {
					ban[i][j]=0;		//クソガバ初期化
					visited[i][j]=0;
				}
			}
			int N=sc.nextInt();
			for(int i=0; i<N; i++) {
				int color=sc.nextInt();
				int muki=sc.nextInt();//0 1
				int xx=sc.nextInt();
				int yy=sc.nextInt();
				if(muki==0) {
					ban[yy][xx]+=color;		//いもす
					ban[yy+1][xx]+=color;
					ban[yy][xx+4]-=color;
					ban[yy+1][xx+4]-=color;
				}
				else {
						ban[yy][xx]+=color;	//いもす
						ban[yy+1][xx]+=color;
						ban[yy+2][xx]+=color;
						ban[yy+3][xx]+=color;
						ban[yy][xx+2]-=color;
						ban[yy+1][xx+2]-=color;
						ban[yy+2][xx+2]-=color;
						ban[yy+3][xx+2]-=color;
				}
			}
			for(int i=0; i<=h+1; i++) {
				for(int j=0; j<w+1; j++) {
					ban[i][j+1]=ban[i][j]+ban[i][j+1];
				}
			}
			dfs(sx,sy,ban[sy][sx]);
			if(visited[gy][gx]==1) {
				pl("OK");
			}
			else {
				pl("NG");
			}
		}
	}
	public static void dfs(int x,int y,int color) {
		if(visited[y][x]==0) {
			visited[y][x]=1;
			for(int i=0; i<4; i++) {
				if(0<=x+xv[i] && x+xv[i]<=w && 0<=y+yv[i] && y+yv[i]<=h) {
					if(visited[y+yv[i]][x+xv[i]]==0 && color==ban[y+yv[i]][x+xv[i]]) {
						dfs(x+xv[i],y+yv[i],color);
					}
				}
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int N=sc.nextInt();
		int[][] GRID=new int[H][W];
		int[] layer=new int[N];
		for(int i=0; i<N; i++) {
			layer[i]=sc.nextInt();
		}
		int jyouge=1;
		int x=0;
		int color=0;
		while(true) {
			if(color==N) {
				break;
			}
			else {
				if(jyouge==1) {
					for(int i=0; i<H; i++) {
						if(layer[color]>0) {
							//pl(i+" "+x+" "+(color+1));
							GRID[i][x]=color+1;
							layer[color]--;
						}
						if(color<N && layer[color]==0) {
							color++;
						}
						if(i==H-1) {
							jyouge=-1;
							x++;
						}
					}
				}
				else {
					for(int i=H-1; i>=0; i--) {
						if(layer[color]>0) {
							//pl(i+" "+x+" "+(color+1));
							GRID[i][x]=color+1;
							layer[color]--;
						}
						if(color<N && layer[color]==0) {
							color++;
						}
						if(i==0) {
							jyouge=1;
							x++;
						}
					}
				}
			}
		}

		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(j==W-1) {
					p(GRID[i][j]);
					pl();
				}
				else {
					p(GRID[i][j]+" ");
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
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		while(true) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H*W==0) {
				System.exit(0);
			}
			int max=0;
			int[][] imos=new int[H+2][W+2];
			int[] omote=new int[W];
			for(int i=0; i<=H+1; i++) {
				Arrays.fill(imos[i], 0);
			}
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					imos[i+1][j+1]=sc.nextInt();
				}
			}
			int zentan=1;
			for(int i=0; i<H; i++) {
				zentan*=2;
			}
			for(int i=0; i<zentan; i++) {
				Arrays.fill(omote, 0);
				int tmp=i;
				for(int j=1; j<=H; j++) {
					imos[j][W+1]=0;
					imos[j][0]=0;
					if(tmp%2==1) {
						imos[j][W+1]--;
						imos[j][0]++;
					}
					else {
						imos[j][W+1]=0;
						imos[j][0]=0;
					}
					tmp/=2;
				}
				for(int j=1; j<=H; j++) {
					for(int k=1; k<=W; k++) {
						imos[j][k]=(imos[j][k]+imos[j][0])%2;
						if(imos[j][k]==1) {
							omote[k-1]++;
						}
					}
				}
				int tmpose=0;
				for(int j=0; j<W; j++) {
					tmpose+=Math.max(omote[j], H-omote[j]);
				}
				max=Math.max(tmpose, max);
				for(int j=1; j<=H; j++) {
					for(int k=1; k<=W; k++) {
						imos[j][k]=(imos[j][k]+imos[j][0])%2;
					}
				}
			}
			pl(max);
		}
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}

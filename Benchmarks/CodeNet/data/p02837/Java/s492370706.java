import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		int[][]mat=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=-1;
			}
		}
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			for(int j=0;j<a;j++) {
				mat[i][sc.nextInt()-1]=sc.nextInt();
			}
		}
		int ans=0;
		for(int msk=0;msk<(1<<n);msk++) {
			int []all=new int[n];
			for(int j=0;j<n;j++) {
				if(((1<<j)&msk)!=0) {
					all[j]=1;
				}
				else {
					all[j]=0;
				}
			}
			boolean yes=true;
			for(int j=0;j<n;j++) {
				if(((1<<j)&msk)!=0) {
					for(int k=0;k<n;k++) {
						if(mat[j][k]!=-1) {
							if(mat[j][k]!=all[k]) {
								yes=false;
							}
							
						}
					}
				}
			}
			if(yes) {
				//System.out.println(msk);
				ans=Math.max(ans, Integer.bitCount(msk));
			}
		}
		pw.println(ans);
		pw.flush();
	}
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;

		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int[] takearr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public long[] takearrl(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public Integer[] takearrobj(int n) throws IOException {
			Integer[] in = new Integer[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public Long[] takearrlobj(int n) throws IOException {
			Long[] in = new Long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
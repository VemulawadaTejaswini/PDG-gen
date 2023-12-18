import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		long[]a=sc.takearrl(n);
		long []cnt0=new long[62];
		long []cnt1=new long[62];
		for(int i=0;i<n;i++) {
			for(int j=0;j<62;j++) {
				if(((1l<<j)&a[i])!=0) {
					cnt1[j]++;
				}
				else {
					cnt0[j]++;
				}
			}
		}
		long ans=0;
		int mod=(int)1e9+7;
		for(int i=0;i<62;i++) {
			long add=(((cnt0[i]*cnt1[i])%mod)*((1l<<i)%mod))%mod;
			//System.out.println(cnt0[i]+" "+cnt1[i]+" "+add+" "+i);
			ans=(ans+add)%mod;
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
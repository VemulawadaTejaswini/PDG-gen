import java.io.*;
import java.util.Arrays;
import java.util.*;
public class Main{
	static int[] weights;
	static int[] values;
	static long[][]memo;
	static int n,w;
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		n=sc.nextInt();
		w=sc.nextInt();
		weights=new int[n];
		values=new int[n];
		memo=new long[n+1][w+1];
		for(long[] x:memo) {
			Arrays.fill(x, -1);
		}
		for(int i=0;i<n;i++) {
			weights[i]=sc.nextInt();
			values[i]=sc.nextInt();
		}
		pw.println(maxsum(0,w));
		pw.close();
	}
	public static long maxsum(int idx,int av) {
		if (av<0)return -(int)1e9;
		if(idx==n)return 0;
		if(memo[idx][av]!=-1) {
			return memo[idx][av];
		}
		long take=values[idx]+maxsum(idx+1,av-weights[idx]);
		long leave=maxsum(idx+1,av);
		memo[idx][av]=Math.max(take, leave);
		return memo[idx][av];
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
	}


}

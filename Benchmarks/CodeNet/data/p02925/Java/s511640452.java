
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;






public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
    //public static long mod = (long) (1e9+7);
    public final static int MAX = (int)1e5;
  // static Scanner sc = new Scanner(System.in);
   static List<Integer>[] edge;
   private static int N = (int) (2e5 + 11);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();

	 int n = sc.nextInt();
	 int[][] a = new int[n+1][n];
	 
	Deque<Integer>[] dq = new ArrayDeque[n+1];
	
	for(int i=1;i<=n;++i) {
		dq[i] = new ArrayDeque<>();
		 for(int j=1;j<=n-1;++j)
			 dq[i].addLast(sc.nextInt());
	 }
    long ans = 0;
	boolean run = true;
	while(run) {
		run = false;
		boolean[] done = new boolean[n+1];
		for(int i=1;i<=n;++i) {
			if(dq[i].size() == 0) continue;
			int person = dq[i].getFirst();
			if(done[i] || done[person]) continue;
		
			if(dq[person].size() > 0 && dq[person].getFirst() == i) {
				run = true;
				done[i] = true;
				done[person] = true;
				dq[i].removeFirst();
				dq[person].removeFirst();
			}
		}
		if(run) ++ans;
	}
	run = true;
	 for(int i=1;i<=n;++i) if(dq[i].size() != 0) run = false;
	 if(run) {
		out.print(ans);
	 }else out.print(-1);
	 out.close();
	}
}
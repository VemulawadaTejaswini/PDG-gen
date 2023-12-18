import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, s;
	static int[][][] memo;
	static int[] a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt() + 1;
		if (k == 0)
			return;
		String s = sc.nextLine();
		ad = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++)
			ad[i] = new ArrayList<>();
		int lo = -1;
		int[] l = new int[n];
		int[] nums = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == 'x') {
				l[i] = lo;
				if(lo==-1)
					nums[i]=0;
				else
				nums[i] =nums[lo];
			}
			else {
				int o = -1;
				if (i + c < n) {
					if (s.charAt(i + c) == 'x')
						o = l[i + c];
					else
						o = i + c;
				}
				l[i] = o;
				lo = i;
				if (i + c >= n)
					nums[i] = 1;
				else
					nums[i] = 1 + nums[i + c];
				// ad[nums[i]].add(i);
			}
		}
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; i++)
			if (!vis[i] && nums[i]>=k) {
                int kk=i;
                while(kk!=-1) {
                	if(vis[kk])
                		break;
                	vis[kk]=true;
                   ad[nums[kk]].add(kk);
                   kk=l[kk];
                }
			}
		if (nums[lo] > k)
			return;
		TreeSet<Integer> ts=new TreeSet<>();
		for (int i = 0; i <= n; i++)
			if (ad[i].size() == 1)
				ts.add(ad[i].get(0) + 1);
		for(int i :ts)
			System.out.println(i);
		out.close();
	}

	static class pair {
		int id;
		int v;

		public pair(int i, int vi) {
			id = i;
			v = vi;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
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

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}

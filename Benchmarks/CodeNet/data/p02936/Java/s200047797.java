import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		FastReader scan = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		Task solver = new Task();
		solver.solve(1, scan, out);
		out.close();
	}
	
	static class Task {
		static ArrayList<Integer>[] adj;
		static long[] counter;
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			int n = scan.nextInt(), q = scan.nextInt();
			adj = new ArrayList[n];
			counter = new long[n];
			for(int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
			}
			for(int i = 0; i < n-1; i++) {
				int a = scan.nextInt()-1, b = scan.nextInt()-1;
				adj[a].add(b);
				adj[b].add(a);
			}
			for(int i = 0; i < q; i++) counter[scan.nextInt()-1] += scan.nextLong();
			go(0, -1, 0);
			for(long i : counter) out.print(i + " ");
		}
		static void go(int at, int p, long curr) {
			long temp = counter[at];
			counter[at] += curr;
			curr += temp;
			for(int i : adj[at]) {
				if(i != p) go(i, at, curr);
			}
		}
	}
	
	static void shuffle(int[] a) {
		Random get = new Random();
		for(int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	
	static void shuffle(long[] a) {
		Random get = new Random();
		for(int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			long temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public FastReader(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}

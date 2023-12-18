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
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			int n = scan.nextInt();
			String[] a = new String[n];
			for(int i = 0; i < n; i++) a[i] = convert(scan.next());
			Arrays.sort(a);
			long at = 0, total = 0;
			String curr = "";
			for(int i = 0; i < n; i++) {
				if(a[i].equals(curr)) at++;
				else {
					total += at*(at-1)/2;
					at = 1;
					curr = a[i];
				}
			}
			total += at*(at-1)/2;
			out.println(total);
		}
		
		static String convert(String s) {
			ArrayList<Character> x = new ArrayList<>();
			for(char c : s.toCharArray()) x.add(c);
			Collections.sort(x);
			char[] res = new char[s.length()];
			for(int i = 0; i < res.length; i++) res[i] = x.get(i);
			return new String(res);
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

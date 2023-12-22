import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		Integer[] mn = new Integer[n], mx = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			mn[i] = sc.nextInt();
			mx[i] = sc.nextInt();
		}
		
		Arrays.sort(mn);
		Arrays.sort(mx);
		
		if(n % 2 == 1) {
			int lo = mn[n/2], hi = mx[n/2];
			out.println(hi - lo + 1);
		}else {
			int lo = mn[(n - 1)/2] + mn[n / 2];
			int hi = mx[(n - 1)/2] + mx[n / 2];
			out.println(hi - lo + 1);
		}
		out.close();
	}

}

class Scanner {
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

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}
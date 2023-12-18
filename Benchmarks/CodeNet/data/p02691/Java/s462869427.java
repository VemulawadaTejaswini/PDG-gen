import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) throws Exception {
		TreeMap<Integer, Integer> mp = new TreeMap<>();
		int n = sc.nextInt(), arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			mp.put(arr[i] + i, mp.getOrDefault(arr[i] + i, 0) + 1);
		}
		
		int cnt = 0;
		for(int i = n - 1; i >= 0; i--) {
			int cur = arr[i] + i;
			mp.put(cur, mp.get(cur) - 1);
			cnt += mp.getOrDefault(i - arr[i], 0);
		}
		
		out.println(cnt);
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
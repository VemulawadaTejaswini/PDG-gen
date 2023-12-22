import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Main {
	static class InputReader{ 
	BufferedReader reader;
	StringTokenizer tokenizer;
	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}
	String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public Long nextLong() {
		return Long.parseLong(next());
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	}
	static InputReader r = new InputReader(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Solve();
		pw.close();
	}
	static class Solve {
		Solve() {// if b > a || c > b
			int n = r.nextInt(), k = r.nextInt();
			int[] arr = new int[n];
			for (int i=0; i < n; i++) {
				arr[i] = r.nextInt();
			}
			int[] val = new int[n];
			for (int i=0; i < n; i++) {
				val[i] = 0;
			}
			int firstprod=1;
			for (int i=0; i < k; i++) {
				firstprod *= arr[i];
			}
			val[k-1] = firstprod;
			for (int i=k; i < n; i++) {
				val[i] = (val[i-1] / arr[i-k]) * arr[i];
			}
			for (int i=k; i < n; i++) {
				if (val[i] > val[i-1]) {
					pw.println("Yes");
				} else {
					pw.println("No");
				}
			}
			return;
		}
	}
}

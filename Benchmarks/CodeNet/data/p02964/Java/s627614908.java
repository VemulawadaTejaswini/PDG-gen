import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static final int MAX = 200002;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long K = sc.nextLong() * N;
		int[] A = new int[2 * N];
		for (int i = 0; i < N; i++) {
			A[N + i] = A[i] = sc.nextInt();
		}
		int[] last = new int[MAX];
		Arrays.fill(last, -1);
		int[] next = new int[N];
		for (int i = 0; i < 2 * N; i++) {
			if (last[A[i]] != -1) {
				next[last[A[i]]] = i % N;
			}
			last[A[i]] = i % N;
		}
		int[] sum = new int[N];
		for (int i = 0; i < N; i++) {
			sum[i] = next[i] - i;
			if (sum[i] <= 0) sum[i] += N;
			sum[i]++;
		}
		boolean[] visited = new boolean[N];
		long[] position = new long[N];
		long cicle = 0;
		int current = 0;
		while (!visited[current]) {
			visited[current] = true;
			position[current] = cicle;
			cicle += sum[current];
			current += sum[current];
			current %= N;
		}
		long realCicle = cicle - position[current];
		long begin = position[current];
		int from = 0;
		if (K > begin) {
			K -= begin;
			from = current;
			K %= realCicle;
		}
		
		int[] values = new int[N + 2];
		boolean[] got = new boolean[MAX];
		int size = 0;
		while (K > 0) {
			if (sum[from] <= K) {
				K -= sum[from];
				from += sum[from];
				from %= N;
			} else {
				while (K > 0) {
					int val = A[from];
					if (got[val]) {
						while (values[size - 1] != val) {
							got[values[size - 1]] = false;
							size--;
						}
						got[values[size - 1]] = false;
						size--;
					} else {
						got[val] = true;
						values[size++] = val;
					}
					K--;
					from++;
					from %= N;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			if (i > 0) out.print(" ");
			out.print(values[i]);
		}
		out.println();
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}

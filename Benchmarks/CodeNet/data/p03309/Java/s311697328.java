import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int N = IN.nextInt();
		int[] A = new int[N + 1];
		HashMap<Integer, Integer> X = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			int tmp = IN.nextInt() - i;
			A[i] = tmp;
			X.put(tmp, X.getOrDefault(tmp, 0) + 1);
		}

		int num = A[1];
		int freq = 0;
		for (int k: X.keySet()) {
			int v = X.get(k);
			if (v > freq) {
				num = k;
				freq = v;
			}
		}
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			ans += Math.abs(A[i] - num);
		}
		puts(ans);
		flush();
	}
	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}

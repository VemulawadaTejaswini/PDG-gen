import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int K = sc.nextInt();
			int M = sc.nextInt();
			int[] next = new int[N];
			int[] prev = new int[N];
			for (int i = 0; i < N; ++i) {
				next[i] = (i + 1) % N;
				prev[i] = (i + N - 1) % N;
			}
			int pos = M - 1;
			next[prev[pos]] = next[pos];
			prev[next[pos]] = prev[pos];
			for (int i = 0; i < N - 2; ++i) {
				for (int j = 0; j < K; ++j) {
					pos = next[pos];
				}
				next[prev[pos]] = next[pos];
				prev[next[pos]] = prev[pos];
			}
			System.out.println(next[pos] + 1);
		}
	}

}
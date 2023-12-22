import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] H, W;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			H = new int[N + 1];
			W = new int[M + 1];
			for (int i = 0; i < N; ++i) {
				H[i + 1] = H[i] + sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				W[i + 1] = W[i] + sc.nextInt();
			}
			int[] len = new int[N * (N + 1) / 2 + 2];
			int idx = 1;
			for (int i = 0; i <= N; ++i) {
				for (int j = i + 1; j <= N; ++j) {
					len[idx++] = H[j] - H[i];
				}
			}
			len[len.length - 1] = Integer.MAX_VALUE;
			Arrays.sort(len);
			long ans = 0;
			for (int i = 0; i <= M; ++i) {
				for (int j = i + 1; j <= M; ++j) {
					ans += count(len, W[j] - W[i]);
				}
			}
			System.out.println(ans);
		}
	}

	static int count(int[] len, int v) {
		int l = 0;
		int r = len.length - 1;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (len[m] < v) {
				l = m;
			} else {
				r = m;
			}
		}
		int lower = l;
		l = 0;
		r = len.length - 1;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (len[m] <= v) {
				l = m;
			} else {
				r = m;
			}
		}
		int upper = r;
		return upper - lower - 1;
	}

}
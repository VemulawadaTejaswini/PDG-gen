import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[] H, W;
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

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
			map.clear();
			for (int i = 0; i <= N; ++i) {
				for (int j = i + 1; j <= N; ++j) {
					int len = H[j] - H[i];
					if (!map.containsKey(len)) {
						map.put(len, 1);
					} else {
						map.put(len, map.get(len) + 1);
					}
				}
			}
			long ans = 0;
			for (int i = 0; i <= M; ++i) {
				for (int j = i + 1; j <= M; ++j) {
					int len = W[j] - W[i];
					if (map.containsKey(len)) {
						ans += map.get(len);
					}
				}
			}
			System.out.println(ans);
		}
	}
}
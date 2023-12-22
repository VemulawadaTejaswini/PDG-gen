import java.util.HashMap;

public class Main {
	MyScanner sc = new MyScanner();

	void run() {
		for (;;) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if ((N | M) == 0) return;
			int[] sumH = new int[N + 1];
			int[] sumW = new int[M + 1];
			for (int i = 1; i <= N; i++) sumH[i] = sumH[i - 1] + sc.nextInt();
			for (int i = 1; i <= M; i++) sumW[i] = sumW[i - 1] + sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i <= N; i++) {
				for (int j = 0; j <= M; j++) {
					int v = sumH[i] - sumW[j];
					map.put(v, map.containsKey(v) ? map.get(v) + 1 : 1);
				}
			}
			long ans = 0;
			for (int key : map.keySet()) {
				int val = map.get(key);
				ans += (val * (val - 1)) / 2;
			}
			System.out.println(ans);
		}
	}
	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
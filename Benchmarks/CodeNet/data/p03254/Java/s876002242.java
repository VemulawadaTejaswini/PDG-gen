import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		x = Integer.parseInt(strArr[1]);
	}

	int x;

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = Integer.parseInt(strArr[i]);
		Arrays.sort(a);
		int ans = 0;
		for (int i : a) {
			// System.out.println(i);
			if (x >= i) {
				ans++;
				x -= i;
			} else {
				break;
			}
		}
		if (ans == N && x > 0)
			ans--;
		System.out.println(ans);
	}

	public void solve() {

	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		X = new int[N];
		Y = new int[N];
		H = new int[N];
	}

	int[] X;
	int[] Y;
	int[] H;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		X[cnt] = Integer.parseInt(strArr[0]);
		Y[cnt] = Integer.parseInt(strArr[1]);
		H[cnt] = Integer.parseInt(strArr[2]);
		cnt++;
	}

	public void solve() {
		int ok = 1;
		for (int cx = 0; ok == 1 && cx <= 100; cx++) {
			for (int cy = 0; ok == 1 && cy <= 100; cy++) {
				ok = 0;
				int h = 0;
				for (int i = 0; i < N; i++) {
					if (H[i] != 0) {
						h = Math.abs(cx - X[i]) + Math.abs(cy - Y[i]) + H[i];
						break;
					}
				}
				for (int i = 0; i < N; i++) {
					if (H[i] == 0) {
						if (h > Math.abs(cx - X[i]) + Math.abs(cy - Y[i]))
							ok = 1;
					} else {
						if (h != Math.abs(cx - X[i]) + Math.abs(cy - Y[i]) + H[i])
							ok = 1;
					}
				}
				if (ok == 0) {
					System.out.println(cx + " " + cy + " " + h);
					return;
				}
			}
		}

	}
}

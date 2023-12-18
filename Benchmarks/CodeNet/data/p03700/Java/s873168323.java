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
	int A;
	int B;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		A = Integer.parseInt(strArr[1]);
		B = Integer.parseInt(strArr[2]);
		// System.out.println(N);
		HP = new int[N];
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int[] HP;

	public void readBody(String str) {
		// System.out.println(str);
		HP[cnt] = Integer.parseInt(str);
		cnt++;
	}

	public void solve() {
		int max = 0;
		for (int s : HP) {
			if (s > max)
				max = s;
		}
		int min = 0;
		max = max / B + 1;
		for (; max - min > 1;) {
			int t = (max - min) / 2 + min;
			if (enough(t))
				max = t;
			else
				min = t;
		}
		System.out.println(max);
	}

	private boolean enough(int t) {
		long cnt = 0;
		for (int h : HP) {
			if (h > B * t) {
				long add = h - B * t;
				cnt += add / (A - B);
				if (add % (A - B) != 0)
					cnt++;
			}
		}
		return cnt <= t;
	}

}

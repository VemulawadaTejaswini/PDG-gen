import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
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
		int W = Integer.parseInt(strArr[0]);
		int a = Integer.parseInt(strArr[1]);
		int b = Integer.parseInt(strArr[2]);

		int al = a;
		int ar = a + W;
		int bl = b;
		int br = b + W;

		if (al <= bl && bl <= ar) {
			System.out.println(0);
			return;
		}
		if (al <= br && br <= ar) {
			System.out.println(0);
			return;
		}
		if (ar < bl) {
			System.out.println((bl - ar));
			return;
		}
		System.out.println((al - br));

		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}
}

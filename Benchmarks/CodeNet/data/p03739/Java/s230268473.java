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
	}

	public boolean hasNext() {
		return cnt < 1;
	}

	int[] A;

	public void readBody(String str) {
		// System.out.println(str);]
		String[] strArr = str.split(" ");
		A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = Integer.parseInt(strArr[i]);
		if (A[0] != 0) {
			long cnt1 = cnt();
			long cnt2;
			if (A[0] > 0) {
				cnt2 = A[0] + 1;
				A[0] = -1;
			} else {
				cnt2 = -1 * A[0] + 1;
				A[0] = 1;
			}
			cnt2 += cnt();
			if (cnt1 < cnt2)
				System.out.println(cnt1);
			else
				System.out.println(cnt2);
		} else {
			A[0] = 1;
			long cnt1 = cnt() + 1;
			A[0] = -1;
			long cnt2 = cnt() + 1;
			if (cnt1 < cnt2)
				System.out.println(cnt1);
			else
				System.out.println(cnt2);
		}
		cnt++;
	}

	private long cnt() {
		int s = 1;
		if (A[0] < 0)
			s = -1;
		long ans = 0;
		int sum = A[0];
		for (int i = 1; i < N; i++) {
			s = s * -1;
			sum = sum + A[i];
			if (s == -1 && sum >= 0) {
				ans += (sum + 1);
				sum = -1;
			} else if (s == 1 && sum <= 0) {
				ans += (-sum + 1);
				sum = 1;
			}
		}
		return ans;
	}
}

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
		// return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String ans = str;
		for (;;) {
			int n = 0;
			for (char c : ans.toCharArray()) {
				if (c == '(')
					n++;
				else if (c == ')')
					n--;
				if (n < 0)
					break;
			}
			if (n == 0)
				break;
			else if (n < 0)
				ans = "(" + ans;
			else {
				for (int i = 0; i < n; i++)
					ans = ans + ")";
			}
		}
		System.out.println(ans);
		cnt++;
	}
}

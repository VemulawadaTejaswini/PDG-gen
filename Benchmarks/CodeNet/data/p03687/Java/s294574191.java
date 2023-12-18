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

	public void readHead(String inStr) {
		// String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		String str = inStr;

		char[] cntChar = new char[26];
		for (char c : str.toCharArray()) {
			cntChar[c - 'a']++;
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < cntChar.length; i++) {
			if (cntChar[i] > 0) {
				int cnt = 0;
				for (str = inStr; isMix(str); str = Shrinking(str, (char) (i + 'a'))) {
					// System.out.println(str);
					cnt++;
				}
				if (cnt < ans)
					ans = cnt;
			}
		}

		System.out.println(ans);
	}

	private boolean isMix(String str) {
		char ctop = str.charAt(0);
		for (char c : str.toCharArray()) {
			if (c != ctop)
				return true;
		}
		return false;
	}

	private String Shrinking(String str, char pick) {
		String ans = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i + 1) == pick)
				ans = ans + str.charAt(i + 1);
			else
				ans = ans + str.charAt(i);
		}
		return ans;
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}
}

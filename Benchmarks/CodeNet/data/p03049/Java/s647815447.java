import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		cntAB = 0;
		cntBA = 0;
		cntBX = 0;
		cntXA = 0;
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int cntAB;
	int cntBA;
	int cntBX;
	int cntXA;

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		Pattern p = Pattern.compile("AB");
		Matcher m = p.matcher(str);
		for (; m.find();) {
			cntAB++;
		}
		if (str.charAt(0) == 'B' && str.charAt(str.length() - 1) == 'A')
			cntBA++;
		else if (str.charAt(0) == 'B')
			cntBX++;
		else if (str.charAt(str.length() - 1) == 'A')
			cntXA++;
	}

	public void solve() {
		int ans = 0;
		if (cntBA == 0) {
			ans = Integer.min(cntXA, cntBX);
		} else {
			if (cntXA + cntBX > 0) {
				ans = Integer.min(cntXA, cntBX) + cntBA;
			} else {
				ans = (cntBA - 1);
			}
		}
		System.out.println(ans);
	}
}

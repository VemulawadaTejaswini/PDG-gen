import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

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
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	ArrayList<Integer> A;

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		A = new ArrayList<Integer>();
		for (String s : strArr)
			A.add(Integer.parseInt(s));
		cnt++;
	}

	public void solve() {
		A.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return Integer.valueOf(o2).compareTo(Integer.valueOf(o1));
			}
		});
		int alice = 0;
		int bob = 0;
		int i = 0;
		for (int card : A) {
			if (i % 2 == 0)
				alice += card;
			else
				bob += card;
			i++;
		}

		System.out.println(alice - bob);
	}
}

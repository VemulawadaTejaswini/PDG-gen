import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		ArrayList<String> inLines = new ArrayList<String>();
		for (; cin.hasNext();) {
			inLines.add(cin.nextLine());
		}
		Solver solver = new Solver();
		solver.solve(inLines);
	}
}

class Solver {

	public void solve(ArrayList<String> inLines) {
		String[] strArr = inLines.get(0).split(" ");
		int N = Integer.parseInt(strArr[0]);
		int M = Integer.parseInt(strArr[1]);
		int[] l = new int[N];
		int[] r = new int[N];
		for (int i = 0; i < N; i++) {
			strArr = inLines.get(i + 1).split(" ");
			l[i] = Integer.parseInt(strArr[0]);
			r[i] = Integer.parseInt(strArr[1]);
		}
		// for (int i : l)
		// System.out.println(i);
		// for (int i : r)
		// System.out.println(i);
		for (int i = 1; i <= M; i++) {
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				if (l[j] % i == 0)
					cnt++;
				else if ((l[j] / i) * i + i > l[j] && (l[j] / i) * i + i <= r[j])
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}

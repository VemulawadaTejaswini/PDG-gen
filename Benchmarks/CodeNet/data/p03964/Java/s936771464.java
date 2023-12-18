import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arg;
		long t[] = new long[n];
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			arg = br.readLine().split(" ");
			t[i] = Integer.parseInt(arg[0]);
			a[i] = Integer.parseInt(arg[1]);

		}

		Solver sol = new Solver();
		System.out.println(sol.solve(t, a));
	}

}

class Solver {

	long solve(long[] t, long[] a) {

		long tempT = 0, tempA = 0;
		for (int i = 1; i < t.length; i++) {

			if (t[i] >= t[i - 1] && a[i] >= a[i - 1]) {

				tempT = t[i];
				tempA = a[i];

			} else {
				for (int j = 2; true; j++) {
					tempT = t[i] * j;
					tempA = a[i] * j;
					if (tempT >= t[i - 1] && tempA >= a[i - 1])
						break;
				}

			}
			t[i] = tempT;
			a[i] = tempA;

		}
		return t[t.length - 1] + a[a.length - 1];
	}

}

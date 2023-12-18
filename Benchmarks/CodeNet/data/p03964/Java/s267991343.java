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

			if (t[i] < t[i - 1] && a[i] < a[i - 1]) {
				if (t[i - 1]/(double) t[i] > (double)a[i - 1] /a[i]) {
					tempT = (long) ((Math.ceil((double) t[i - 1] / t[i])) * t[i]);
					tempA = (long) (Math.ceil((double) t[i - 1] / t[i]) * a[i]);
				} else {
					tempA = (long) ((Math.ceil((double) a[i - 1] / a[i])) * a[i]);
					tempT = (long) (Math.ceil((double) a[i - 1] / a[i]) * t[i]);
				}
			} else if (t[i] < t[i - 1] && a[i] >= a[i - 1]) {
				tempT = (long) ((Math.ceil((double) t[i - 1] / t[i])) * t[i]);
				tempA = (long) (Math.ceil((double) t[i - 1] / t[i]) * a[i]);

			} else if (t[i] >= t[i - 1] && a[i] < a[i - 1]) {
				tempA = (long) ((Math.ceil((double) a[i - 1] / a[i])) * a[i]);
				tempT = (long) (Math.ceil((double) a[i - 1] / a[i]) * t[i]);

			} else {
				tempT = t[i];
				tempA = a[i];
			}
			t[i] = tempT;
			a[i] = tempA;

		}
		return tempT + tempA;
	}

}//3
//13 11
//4 9
//1 2

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			T[] ts = new T[N];
			for (int i = 0; i < N; ++i) {
				ts[i] = new T();
			}
			Arrays.sort(ts);
			for (int i = 0; i < N; ++i) {
				System.out.println(ts[i].name);
			}
			System.out.println("#");
		}
	}

	static class T implements Comparable<T> {
		String name;
		int[] v = new int[9];

		T() {
			name = sc.next();
			for (int i = 0; i < 9; ++i) {
				v[i] = sc.nextInt();
			}
		}

		public int compareTo(T o) {
			int v = Double.compare(o.p(), p());
			return v == 0 ? name.compareTo(o.name) : v;
		}

		double p() {
			int profit = v[6] * v[7] * v[8] - v[0];
			int time = v[1] + v[2] + v[3] + v[4] + v[5] + (v[4] + v[5]) * (v[8] - 1);
			return 1. * profit / time;
		}

	}
}
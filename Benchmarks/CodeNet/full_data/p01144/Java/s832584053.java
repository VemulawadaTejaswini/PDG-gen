import java.util.Arrays;
import java.util.Scanner;

public class Main {
	class D implements Comparable<D>{
		int l, p;

		D(int l, int p) {
			this.l = l;
			this.p = p;
		}

		@Override
		public int compareTo(D o) {
			return o.p - this.p;
		}

		@Override
		public String toString() {
			return "(" + l + ", " + p + ")";
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			D[] d = new D[n];
			for (int i = 0; i < n; i++) {
				d[i] = new D(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(d);
			int id = 0;
			while (0 < m && id < n) {
				if (d[id].l == 0) {
					id++;
					continue;
				}
				d[id].l--;
				m--;
			}

			int ans = 0;
			for (int i = 0; i < n; i++) {
				ans += d[i].l * d[i].p;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
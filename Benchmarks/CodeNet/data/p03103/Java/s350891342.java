import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Mise[] mise = new Mise[n];
		for (int i = 0; i < n; i++) {
			mise[i] = new Mise(sc.nextInt(), sc.nextInt());
		}
		sc.close();

		// aの昇順
		Arrays.sort(mise, new Comparator<Mise>() {
			public int compare(Mise m1, Mise m2) {
				return m1.a - m2.a;
			}
		});

		long ans = 0L;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			long a = mise[i].a;
			int b = mise[i].b;
			if (cnt + b >= m) {
				ans += a * (m - cnt);
				break;
			} else {
				cnt += b;
				ans += a * b;
			}
		}
		System.out.println(ans);
	}

	static class Mise {
		int a;
		int b;
		public Mise(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}

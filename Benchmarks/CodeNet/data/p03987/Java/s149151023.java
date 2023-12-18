import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.solve();
	}

	public void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Num[] numarr = new Num[N + 1];
		for (int i = 1; i <= N; i++) {
			int n = sc.nextInt();
			Num num = new Num(n, i);
			numarr[n] = num;
		}
		sc.close();

		long ans = 0;
		TreeSet<Num> t = new TreeSet<>();
		for (int i = 1; i < numarr.length; i++) {
			Num co = numarr[i];
			Num lo = t.floor(co);
			Num ro = t.ceiling(co);
			int l = (lo == null) ? 0 : lo.pos;
			int r = (ro == null) ? N + 1 : ro.pos;
			long min = Math.min(co.pos - l, r - co.pos);
			long max = Math.max(co.pos - l, r - co.pos);
			ans += i * min * (min + 1) / 2;
			ans += i * min * (max - min);
			ans += i * (r - l - 1 - max) * (r - l - max) / 2;
			//System.out.println("i:" + i + ",l:" + l + ",r:" + r + ",min:" + min + ",max:" + max + ",ans:" + ans);
			t.add(numarr[i]);
		}

		System.out.println(ans);
	}

	class Num implements Comparable<Num> {
		int a = 0;
		int pos = 0;

		Num(int a, int pos) {
			this.a = a;
			this.pos = pos;
		}

		@Override
		public int compareTo(Num o) {
			return pos - o.pos;
		}
	}
}

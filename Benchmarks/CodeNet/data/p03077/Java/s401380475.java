import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long[] p = new long[5];
		p[0] = n;
		long[] t = new long[5];
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextLong();
		}

		long ans = 1;
		while (p[4] != n) {
			for (int i = t.length - 2; i >= 0; i--) {
				p[i + 1] += Math.min(t[i], p[i]);
				p[i] = Math.max(0, p[i] - t[i]);
			}
			ans++;

		}

		System.out.println(ans);

	}

}

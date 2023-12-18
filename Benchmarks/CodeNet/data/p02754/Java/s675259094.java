import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long n = Long.parseLong(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		if (a == 0) {
			System.out.println(0);
			return;
		}

		if (b == 0) {
			System.out.println(n);
			return;
		}

		long q = n / (a + b);
		long r = n % (a + b);
		long ans = (r == 0) ? a * q : (r < a) ? a * q + r : a * q + a;
		System.out.println(ans);
	}

}

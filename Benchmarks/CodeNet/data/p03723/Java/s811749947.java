import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Integer.parseInt(sc.next());
		long b = Integer.parseInt(sc.next());
		long c = Integer.parseInt(sc.next());
		if (a == b && b == c) {
			if (a % 2 == 0) System.out.println("-1");
			else System.out.println("0");
			return;
		}
		int ans = 0;
		while (true) {
			if ((a + b) % 2 != 0 || (b + c) % 2 != 0 || (c + a) % 2 != 0)
				break;
			long ta = (b + c) / 2;
			long tb = (a + c) / 2;
			long tc = (a + b) / 2;
			a = ta;
			b = tb;
			c = tc;
			ans++;
		}
		System.out.println(ans);
	}
}
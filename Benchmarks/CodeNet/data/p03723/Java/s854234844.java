import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		if(a == b && b == c) {
			System.out.println(-1);
			return;
		}
		if(a == 1 && b == 1 && c == 1) {
			System.out.println(1);
			return;
		}
		long ans = 0;
		while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
			ans++;
			long x = a / 2 + b / 2;
			long y = b / 2 + c / 2;
			long z = c / 2 + a / 2;
			a = y;
			b = z;
			c = x;
		}
		System.out.println(ans);
	}
}

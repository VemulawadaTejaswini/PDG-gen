import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a = cin.nextInt();
		int b = cin.nextInt();
		int ans = gcd(a, b);
		for (int i = 2; i < n; i++) {
			b = cin.nextInt();
			ans = gcd(ans, b);
		}
		System.out.println(ans);
	}
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
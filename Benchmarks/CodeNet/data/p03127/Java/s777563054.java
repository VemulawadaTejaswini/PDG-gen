import java.util.Scanner;

public class Main {
	static int min;
	static boolean odd;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int ans = gcd(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			ans = gcd(ans, a[i]);
		}
		System.out.println(ans);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
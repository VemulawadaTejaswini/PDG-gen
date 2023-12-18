import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		for(int i = 0 ; i < T.length ; i++) {
			T[i] = sc.nextLong();
		}
		long ans = T[N - 1];
		int i;
		for (i = N - 2 ; i >= 0 ; i--)
			if (ans % T[i] != 0) {
				ans = lcm(ans, T[i]);
			}
		System.out.println(ans);
	}

	public static long gcd(long a, long b) {
		long v0 = a, v1 = b, v2 = a % b;
		while (v2 != 0) {
			v0 = v1;
			v1 = v2;
			v2 = v0 % v1;
		}
		return v1;
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}

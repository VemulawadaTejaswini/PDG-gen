import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		for(int i = 0 ; i < N ; i++) {
			T[i] = sc.nextLong();
		}
		long ans = T[0];
		for(int i = 1 ; i < N ; i++) {
			ans = lrd(ans, T[i]);
		}
		System.out.println(ans);
	}

	public static long gcd(long a, long b) {
		long v1;
		while(b != 0) {
			v1 = a % b;
			a = b;
			b = v1;
		}
		return a;
	}

	public static long lrd(long a, long b) {
		return a / gcd(a, b) * b;
	}
}

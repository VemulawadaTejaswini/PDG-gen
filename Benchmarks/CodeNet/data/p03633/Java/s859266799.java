import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long t[] = new long[N];
		long ans[] = new long[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextLong();
		}

		int i = 0;
		ans[0] = t[0];
		for(int j = 1; j < N; i++, j++) {
			ans[j] = lcm(ans[i], t[j]);
		}

		System.out.println(ans[N-1]);

	}

	static long gcd(long a, long b) {
		 long v0 = a, v1 = b, v2 = a % b;
		 while (v2 != 0) {
		 v0 = v1;
		 v1 = v2;
		 v2 = v0 % v1;
		 };
		 return v1;
	}

	static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}
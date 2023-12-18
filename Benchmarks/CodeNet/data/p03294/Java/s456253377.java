import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] num = new long[n];
		for(int i = 0; i < n; i ++) {
			num[i] = sc.nextLong();
		}
		long tmp = num[0], ans = 0;
		for(int i = 1; i < n; i++) {
			tmp /= gcd(tmp, num[i]);
			tmp *= num[i];
		}
		tmp--;
		for(int i = 0; i < n; i++) {
			num[i] = tmp % num[i];
			ans += num[i];
		}
		System.out.println(ans);
	}
	public static long gcd(long a, long b) {
		long tmp = a % b;
		while(tmp > 0) {
			a = b;
			b = tmp;
			tmp = a % b;
		}
		return b;
	}
}

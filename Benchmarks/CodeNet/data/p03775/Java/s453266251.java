import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int ans = Integer.MAX_VALUE;
		for(long i = 1 ; i * i <= n ; i++) {
			if(n % i == 0) {
				int a = func(n/i);
				int b = func(i);
				int c = Math.max(a, b);
				ans = Math.min(ans, c);
			}
		}
		System.out.println(ans);
	}

	static int func(long x) {
		int ret = 0;
		while(x >= 1) {
			x /= 10;
			ret++;
		}
		return ret;
	}

}

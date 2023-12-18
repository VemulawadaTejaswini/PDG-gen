import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = n;
		for (int i = 1 ; i <= n / 2 ; i++) {
			int tmp = cal(i,0) + cal(n-i,0);
			if (cnt > tmp) cnt = tmp;
		}
		System.out.println(cnt);
	}

	private static int cal (int n, int m) {
		if (n <= 9) return n + m;
		else return cal((n - n % 10) / 10 , m + n % 10);
	}
}

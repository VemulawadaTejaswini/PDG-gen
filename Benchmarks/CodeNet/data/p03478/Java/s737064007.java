import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		for (int i = 1 ; i <= n ; i++) {
			int sum = i / 10000 + (i - i / 10000 * 10000) / 1000 + (i - i / 1000 * 1000) / 100 + (i - i / 100 * 100) / 10 + i % 10;
			if (a <= sum && b >= sum) cnt += i;
		}
		System.out.println(cnt);
	}
}

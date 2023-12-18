import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long total = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			long b = sc.nextLong();
			total += b;
			if (total >= k) {
				ans = a;
				break;
			}
		}
		System.out.println(ans);
	}
}

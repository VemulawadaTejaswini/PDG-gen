import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] as = new long[100_000 + 1];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			as[a] += b;
		}

		long sum = 0;
		long ans = 0;
		for (int i = 0; i < as.length; i++) {
			sum += as[i];
			if (sum >= k) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}

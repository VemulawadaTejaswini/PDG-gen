import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		long[] a = new long[N + 1];
		long sum = 0, cnt = 0;
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		while (sum % 2 == 0 && sum > 0) {
			for (int i = 0; i < N; i++) {
				if (a[i] % 2 == 0) {
					a[i] = a[i] / 2;
					sum -= a[i];
				} else {
					break;
				}
			}
			cnt++;
		}
		
		System.out.println(cnt);

		sc.close();
	}
}
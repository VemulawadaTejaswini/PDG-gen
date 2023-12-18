import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		int m = 1000000007;

		long answer = 0;
		for (int i = 0; i < 60; i++) {
			long d = (1L << i);
			long count = 0;
			for (int j = 0; j < a.length; j++) {
				if ((d & a[j]) > 0) {
					count++;
				}
			}
			count = count * (n - count);
			answer = (answer + d * count) % m;
		}

		System.out.println(answer % m);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long m = 1000000007L;

		long answer = 0L;
		for (int i = 0; i < 61; i++) {
			long d = (1L << i);
			long count = 0;
			for (int j = 0; j < a.length; j++) {
				if ((d & a[j]) > 0L) {
					count++;
				}
			}
			answer += (d * (count * (n - count))) % m;
			answer %= m;
		}

		System.out.println(answer);
	}
}

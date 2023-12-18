import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		long b[] = new long[N];

		long c[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			c[i] = a[i] + b[i];
		}
		Arrays.sort(c);

		long tk = 0;
		long ao = 0;

		for (int i = 1; i <= N; i++) {
			if (i%2 != 0) {
				tk += c[N-i];
			}
				ao += b[i-1];
		}
		System.out.println(tk - ao);
	}
}

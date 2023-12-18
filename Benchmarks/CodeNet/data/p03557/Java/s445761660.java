import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextLong();
		for (int i = 0; i < n; i++) b[i] = sc.nextLong();
		for (int i = 0; i < n; i++) c[i] = sc.nextLong();

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] >= b[j]) continue;
				for (int k = 0; k < n; k++) {
					if (c[k] <= b[j]) continue;
					answer += (n - k);
					break;
				}
			}
		}

		System.out.println(answer);
	}
}

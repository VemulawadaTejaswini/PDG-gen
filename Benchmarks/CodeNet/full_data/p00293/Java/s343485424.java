import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = (stdIn.nextInt() * 60) + stdIn.nextInt();

		int m = stdIn.nextInt();
		int b[] = new int[m];

		for (int i = 0; i < m; i++)
			b[i] = (stdIn.nextInt() * 60) + stdIn.nextInt();

		int c[] = new int[n + m];
		for (int i = 0; i < n; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < m; i++) {
			c[i + n] = b[i];
		}
		Arrays.sort(c);
		int a1[] = new int[n + m];
		int a2[] = new int[n + m];
		for (int i = 0; i < n + m; i++) {
			a1[i] = c[i] / 60;
			a2[i] = c[i] % 60;
		}
		int cou = 0;
		int ka = -1;
		for (int i = 0; i < n + m; i++) {
			if (ka == c[i])
				continue;

			System.out.print(a1[i] + ":");
			if (a2[i] < 10)
				System.out.print(0);
			System.out.print(a2[i]);
			if (i != n + m - 1)
				System.out.print(" ");
			
			ka = c[i];
		}
		System.out.println();}
}
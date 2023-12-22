import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		long k = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++)
			b[i] = in.nextInt();

		long at = 0;
		int ac = 0;
		for (int i = 0; i < n; i++)
			if (at + a[i] > k)
				break;
			else {
				ac++;
				at += a[i];
			}
		long bt = 0;
		int bc = 0;
		for (int i = 0; i < m; i++)
			if (at + bt + b[i] > k)
				break;
			else {
				bc++;
				bt += b[i];
			}

		int ans = ac + bc;
		while (ac > 0) {
			ac--;
			at -= a[ac];
			while (bc < m)
				if (at + bt + b[bc] > k)
					break;
				else {
					bt += b[bc];
					bc++;
				}
			if (ans < ac + bc)
				ans = ac + bc;
		}
		System.out.println(ans);
	}
}

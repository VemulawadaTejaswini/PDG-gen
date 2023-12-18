import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = Long.parseLong(sc.next());
		for (int i = 0; i < n; i++)
			b[i] = Long.parseLong(sc.next());
		for (int i = 0; i < n; i++)
			c[i] = Long.parseLong(sc.next());
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		long[] u = new long[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			while (index < n && a[index] < b[i])
				index++;
			if (i == 0)
				u[i] = index;
			else
				u[i] = u[i - 1] + index;
		}
		int[] l = new int[n];
		index = 0;
		for (int i = 0; i < n; i++) {
			while (index < n && b[index] < c[i])
				index++;
			l[i] = index;
		}
		int ans = 0;
		for (int i = 0; i < n; i++)
			if (l[i] != 0)
				ans += u[l[i] - 1];
		System.out.println(ans);

	}
}
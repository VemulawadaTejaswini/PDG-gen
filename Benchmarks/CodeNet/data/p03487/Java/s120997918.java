import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = Integer.parseInt(sc.next());
		long a[] = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = Long.parseLong(sc.next());
		Arrays.sort(a);
		int rem = 0;
		int tem = 1;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] == a[i]) {
				tem++;
			}
			if (a[i - 1] != a[i] || i == n - 1)  {
				if (tem < a[i - 1]) {
					rem += tem;
				}
				else if (tem > a[i - 1]) {
					rem += tem - a[i - 1];
				}
				tem = 1;
			}
			if (a[i - 1] != a[i] && i == n - 1)  {
				rem += tem;
			}

		}
		if (n == 1 && a[0] != 1)
			rem = 1;
		System.out.println(rem);
	}
}
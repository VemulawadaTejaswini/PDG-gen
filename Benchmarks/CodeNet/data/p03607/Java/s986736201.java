import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		for (int i = 0 ; i < n; i++)
			a[i] = Long.parseLong(sc.next());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				continue;
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[j] == a[i]) {
					a[j] = 0;
					count++;
				}
			}
			if (count % 2 != 0)
				ans++;
		}
		System.out.println(ans);
	}
}
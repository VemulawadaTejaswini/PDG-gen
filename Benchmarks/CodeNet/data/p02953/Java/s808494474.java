import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		int mem = -1, flg = 0;
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1] && flg == 0) {
				mem = i;
				flg = 1;
			}
		}

		if (mem == -1) {
			System.out.println("Yes");
			System.exit(0);
		} else {
			for (int i = mem; i < n; i++) {
				if (Math.abs(a[mem] - a[i]) >= 2) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
    }
}
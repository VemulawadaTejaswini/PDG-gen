import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		if ((n % 2 == 1 && a[0] != 0) || (n % 2 == 0 && a[0] == 0)) {
			System.out.println(0);
			return;
		}


		int b[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			if (n % 2 == 1) {
				if (a[i] % 2 == 1) {
					System.out.println(0);
					return;
				}
			} else if (n % 2 == 0) {
				if (a[i] % 2 == 0) {
					System.out.println(0);
					return;
				}
			}
			b[a[i]]++;
		}

		long count = 1;
		for (int i = 0; i < b.length; i++) {
			if (i == 0) {
				if (b[i] > 1) {
					System.out.println(0);
					return;
				}
			} else {
				if (b[i] >= 3 || b[i] == 1) {
					System.out.println(0);
					return;
				} else if (b[i] == 2) {
					count *= 2;
				}
			}
		}

		System.out.println((int)(count % (10e9 + 7)));
	}
}

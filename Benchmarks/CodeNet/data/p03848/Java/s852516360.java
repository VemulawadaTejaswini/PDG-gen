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
			b[a[i]]++;
		}

		int count = 0;
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
					count++;
				}
			}
		}

		System.out.println((int)((count * count) % (10e9 + 7)));
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, s;
		int a[];

		a = new int[10];
		while (sc.hasNext()) {
			n = sc.nextInt();
			s = sc.nextInt();

			System.out.println(countFuctrial(n, s, a, 1));
		}
	}

	public static int countFuctrial(int n, int s, int a[], int k) {
		if (k == n + 1) {
			if (s == 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (0 <= s - k * i) {
					if (a[i] == 0) {
						a[i] = k;
						count += countFuctrial(n, s - k * i, a, k + 1);
						a[i] = 0;
					}
				} else {
					break;
				}
			}
			return count;
		}
	}
}
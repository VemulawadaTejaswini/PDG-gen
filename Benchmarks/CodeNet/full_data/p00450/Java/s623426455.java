import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int a[] = new int[100000];
		int count;

		n = scanner.nextInt();
		while (n != 0) {
			count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				count += ((a[i] + 1) % 2);
				if (i % 2 == 1) {
					count = revers(a, i, count);
				}
			}
			System.out.println(count);
			n = scanner.nextInt();
		}
	}
	
	public static int revers(int a[], int n, int count) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == a[n]) {
				break;
			} else {
				a[i] = (a[i] + 1) % 2;
				count += (-2) * a[i] + 1;
			}
		}
		return count;
	}
}
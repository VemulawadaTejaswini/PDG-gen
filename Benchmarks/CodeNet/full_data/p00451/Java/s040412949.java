import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int a[] = new int[100000];
		int count;

		n = scanner.nextInt();
		while (n != 0) {
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				if (i % 2 == 1) {
					revers(a, i);
				}
			}
			count = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					count++;
				}
			}
			System.out.println(count);
			n = scanner.nextInt();
		}
	}
	
	public static void revers(int a[], int n) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == a[n]) {
				break;
			} else {
				a[i] = (a[i] + 1) % 2;
			}
		}
	}
}
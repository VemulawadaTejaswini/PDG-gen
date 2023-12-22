import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[][];

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n][n];
			int i = n / 2 + 1;
			int j = n / 2;
			int number = 1;
			while (n * n >= number) {
				if (a[i % n][j % n] == 0) {
					a[i % n][j % n] = number;
					number++;
					i++;
					j++;
				} else {
					i++;
					j--;
					a[i % n][j % n] = number;
					number++;
					i++;
					j++;
				}
			}
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					System.out.printf("%4d", a[k][l]);
				}
				System.out.println();
			}
			n = sc.nextInt();
		}
	}
}
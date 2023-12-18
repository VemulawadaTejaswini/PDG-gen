import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int c1 = 0;
		int c2 = 0;
		int c4 = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 4 == 0) {
				c4++;
			} else if (a[i] % 2 == 0) {
				c2++;
			} else {
				c1++;
			}
		}
		if (c1 <= c4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

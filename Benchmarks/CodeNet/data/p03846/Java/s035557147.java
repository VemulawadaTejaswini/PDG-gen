import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = stdIn.nextInt();
		int count = 0;
		boolean flag = false;

		if (n % 2 != 0) {
			for (int i = 0; i < (n + 1) / 2; i++) {
				count = 0;
				for (int j = 0; j < n; j++) {
					if (a[j] == n - 2 * i - 1)
						count++;
				}
				if (i == (n + 1) / 2 - 1) {
					if (count != 1) {
						flag = true;
					}
				} else if (count != 2) {
					flag = true;
				}
			}
			if (flag == true)
				System.out.println(0);
			else if (flag == false)
				System.out.println((int) (Math.pow(2, (n - 1) / 2) % (Math.pow(10, 9) + 7)));

		} else if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				count = 0;
				for (int j = 0; j < n; j++) {
					if (a[j] == n - 2 * (i + 1) + 1)
						count++;
				}
				if (count != 2) {
					flag = true;
				}
			}

			if (flag == true)
				System.out.println(0);
			else
				System.out.println((int)(Math.pow(2, n / 2) % (Math.pow(10, 9) + 7)));
		}
	}

}
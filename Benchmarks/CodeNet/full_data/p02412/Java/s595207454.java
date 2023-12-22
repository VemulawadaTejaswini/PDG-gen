import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n, x;
		int i = 0, j = 0, k = 0;
		int count = 0;
		Scanner stdIn = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			n = stdIn.nextInt();
			x = stdIn.nextInt();

			if (n == 0 && x == 0) {
				flag = false;
				break;
			}

			count = 0;
			for (i = 1; i < n; i++) {
				for (j = i + 1; j < n; j++) {
					for (k = x - i - j; k > j; k--) {
						
						if (x == i + j + k && k <= n) {
							
							count++;
						} else {
							
						}
					}
				}

			}
			System.out.println(count);
		}
		stdIn.close();
	}
}
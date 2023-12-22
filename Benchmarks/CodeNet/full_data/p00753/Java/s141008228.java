import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n;
			int n2 = 0;

			int ncou = 0;
			int n2cou = 0;
			int sum = 0;

			boolean flag = true;

			n = scan.nextInt();
			if (n == 0) {
				break;
			}

			n2 = n * 2;

			for (int i = 2; i < n + 1; i++) {
				for (int j = 2; j < (i / 2 + 1); j++) {
					if (i % j == 0)
						flag = false;

				}
				if (flag)
					ncou++;
				flag = true;

			}

			for (int i = 2; i < n2 + 1; i++) {
				for (int j = 2; j < (i / 2 + 1); j++) {
					if (i % j == 0)
						flag = false;

				}
				if (flag)
					n2cou++;
				flag = true;
			}

			sum = n2cou - ncou;

			System.out.println(sum);
		}
		scan.close();
	}

}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		if (n >= 3 && n <= 10000) {
			while (i <= n) {
			
				if (i % 3 == 0) {
					System.out.printf(" %d", i);
				} else if (i % 10 != 0 && i % 3 != 0) {
					int x;
					x = i;
					while (x % 10 != 0) {
						if (x % 10 == 3) {
							System.out.printf(" %d", i);

						}
						x = x / 10;
					}
				}

				i++;
			}
		}
		System.out.printf("\n", i);

	}

}
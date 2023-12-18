import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		if (n == 1) {
			System.out.println("Yes");
		} else {
			boolean flag = true;
			for (int i = 0; i < n - 1; i++) {
				if (h[i + 1] - h[i] <= -2) {
					System.out.println("No");
					System.exit(0);
				} else if (h[i + 1] - h[i] == -1) {
					if (flag) {
						flag = false;
					} else {
						System.out.println("No");
						System.exit(0);
					}
				} else if (h[i + 1] - h[i] >= 1) {
					flag = true;
				}

			}
			System.out.println("Yes");

		}

		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int num[] = new int[1500];
		int i = 0;
		int j = 0;

		while (true) {
			num[i] = sc.nextInt();
			if (i >= 1499 || num[i] == 0)
				break;
			i++;
		}

		while (j < i) {
			// System.out.printf("Case %d: %d\n", j + 1, num[j]);
			System.out.println("Case " + (j + 1) + ": " + num[j]);

			j++;
		}
	}
}
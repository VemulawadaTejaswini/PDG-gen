import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] city = new int[n];

		for (int i = 0; i < m; i++) {
			scanner.nextLine();
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			city[a - 1]++;
			city[b - 1]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(city[i]);
		}
		scanner.close();
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int q = scanner.nextInt();
		int[] point = new int[n];
		for (int i = 0, a; i < q; i++) {
			point[scanner.nextInt() - 1]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(k - q + point[i] > 0 ? "Yes" : "No");
		}

	}

}

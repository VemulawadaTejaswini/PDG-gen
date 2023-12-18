import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] p = new int[n];
		for (int i = 1; i <= n; i++) {
			p[scanner.nextInt() - 1] = i;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(p[i] + (i < n - 1 ? " " : "\n"));
		}
	}

}

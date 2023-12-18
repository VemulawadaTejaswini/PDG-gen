import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if ((n - i - j) * 10000 + j * 5000 + i * 1000 == y) {
					System.out.println((n - i - j) + " " + j + " " + i);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}

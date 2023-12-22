import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0)
				break;

			for (int i = 1; i <= n; i++) {
				if (2 * i > x - i)
					break;
				for (int j = i + 1; j < x - j - i && j <= n; j++) {
					if (x - j - i <= n)
						total++;
				}
			}
			System.out.println(total);
		}
	}
}
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, x, count = 0;

		while (true) {
			n = scanner.nextInt();
			x = scanner.nextInt();
			count = 0;

			if (n == 0 && x == 0)
				break;

			for (int i = 1; i <= n; i++)
				for (int i2 = i; i2 <= n; i2++)
					for (int i3 = i2; i3 <= n; i3++)
						if (!(i == i2 || i2 == i3 || i3 == i))
							if (i + i2 + i3 == x)
								count++;

			System.out.println(count);
		}
	}
}
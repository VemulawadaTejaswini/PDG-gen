import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			if (n == 0 && x == 0)
				break;
			System.out.println(run(n, x));
		}
		System.exit(0);
	}

	private static int run(int n, int x) {
		int result = 0;
		for (int a = 1; a <= n; a++)
			for (int b = a + 1; b <= n; b++)
				for (int c = b + 1; c <= n; c++)
					if (a + b + c == x)
						++result;
		return (result);

	}
}
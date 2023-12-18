import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		boolean ans = false;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j == N)
					ans = true;
			}
		}
		if (ans)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
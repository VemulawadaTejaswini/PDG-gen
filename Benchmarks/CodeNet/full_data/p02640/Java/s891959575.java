import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		for (int i = 1; i <= X; i++) {
			if (2 * i + 4 * (X - i) == Y) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}

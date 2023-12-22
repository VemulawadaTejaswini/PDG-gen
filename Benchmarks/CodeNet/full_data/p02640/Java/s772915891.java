import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int i = 0; i <= 50; i++) {
			for (int j = 0; j <= 25; i++) {
				if ((i + j == x) && (2 * i + 4 * j == y)) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

}

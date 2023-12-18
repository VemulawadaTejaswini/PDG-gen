import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean can = false;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (N == i * j) can = true;
			}
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

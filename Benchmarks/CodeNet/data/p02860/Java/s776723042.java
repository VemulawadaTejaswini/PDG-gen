import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		char[] letters = s.toCharArray();

		for (int i = 0; i < letters.length / 2; i++) {

			if (letters[i] == letters[i + (N / 2)]) {
				cnt++;
			}

		}

		if (letters.length == 1) {
			System.out.println("Yes");
		} else if (letters.length % 2 == 1) {
			System.out.println("No");
		}

		else if (cnt == N / 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

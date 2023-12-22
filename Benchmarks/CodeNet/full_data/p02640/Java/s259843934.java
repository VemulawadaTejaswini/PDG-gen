import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int bird = 0;
		boolean ans = false;

		for (int i = 0; i <= X; i ++) {
			bird = i;
			int tar = X - bird;
			if ((bird * 2 + tar * 4 ) == Y) {
				ans = true;
				break;
			}

		}

		System.out.println(ans ? "Yes" : "No");

		sc.close();
	}
}

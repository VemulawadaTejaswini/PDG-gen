import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int dx = tx - sx;
		int dy = ty - sy;

		String ans = "";

		// 1周目
		// イルカは上に行く
		for (int i = 0; i < dy; i++) {
			ans += "U";
		}

		// イルカは右に行く
		for (int i = 0; i < dx; i++) {
			ans += "R";
		}

		// イルカは下に行く
		for (int i = 0; i < dy; i++) {
			ans += "D";
		}

		// イルカは左に行く
		for (int i = 0; i < dx; i++) {
			ans += "L";
		}

		// 2周目
		// イルカは1つ左に行く
		ans += "L";

		// イルカは上に行く
		for (int i = 0; i < dy + 1; i++) {
			ans += "U";
		}

		// イルカは右に行く
		for (int i = 0; i < dx + 1; i++) {
			ans += "R";
		}

		// イルカは1つ下に行く
		ans += "D";

		// イルカは1つ右に行く
		ans += "R";

		// イルカは下に行く
		for (int i = 0; i < dy + 1; i++) {
			ans += "D";
		}

		// イルカは左に行く
		for (int i = 0; i < dx + 1; i++) {
			ans +="L";
		}

		// イルカは1つ上に行く
		ans += "U";

		System.out.println(ans);

		sc.close();
	}
}

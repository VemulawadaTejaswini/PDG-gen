import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sx = scanner.nextInt();
		int sy = scanner.nextInt();
		int tx = scanner.nextInt();
		int ty = scanner.nextInt();
		String ans = "";

		ans += makeString("U", ty - sy);
		ans += makeString("R", tx - sx);
		ans += makeString("D", ty - sy);
		ans += makeString("L", tx - sx + 1);
		ans += makeString("U", ty - sy + 1);
		ans += makeString("R", tx - sx + 1);
		ans += makeString("U", 1);
		ans += makeString("R", 1);
		ans += makeString("D", ty - sy + 1);
		ans += makeString("L", tx - sx + 1);
		ans += makeString("U", 1);

		System.out.println(ans);
	}

	private static String makeString(String string, int n) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s += string;
		}
		return s;
	}
}
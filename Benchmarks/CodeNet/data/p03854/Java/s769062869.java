import java.util.Scanner;

public class Main {
	/**
	 * Daydream
	 * @param 1 ≦ |S| ≦ 10^5
	 * @param dream, dreamer, erase, eraser
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			StringBuilder sb = new StringBuilder(S).reverse();
			while (check(sb)) {
				// pass
			}
			if (sb.length() == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean check(StringBuilder sb) {
		String check[] = {"maerd", "remaerd", "esare", "resare"};
		for (String c : check) {
			if (sb.toString().startsWith(c)) {
				sb.delete(0, c.length());
				return true;
			}
		}
		return false;
	}
}
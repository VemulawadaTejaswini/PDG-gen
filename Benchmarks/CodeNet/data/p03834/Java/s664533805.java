import java.util.Scanner;

public class Main {
	/**
	 * Haiku
	 * @param s.length = 19
	 * @param s[5], s[13] = ","
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t[] = s.split(",");
			System.out.println(t[0] + " " + t[1] + " " + t[2]);
		}
	}
}
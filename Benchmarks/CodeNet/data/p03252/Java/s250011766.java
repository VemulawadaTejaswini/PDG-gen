import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			if (map.containsKey(tc)) {
				if (sc == map.get(tc)) {

				} else {
					if (sc == tc || (map.get(tc) == tc)) {
						System.out.println("No");
						return;
					}
				}
			}
			map.put(tc, sc);
		}
		System.out.println("Yes");

	}
}

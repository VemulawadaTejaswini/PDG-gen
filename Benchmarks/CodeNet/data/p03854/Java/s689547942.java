import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] keys = {
			"dream",
			"erase",
			"eraser",
			"dreamer" };
		while (s.length() != 0) {
			boolean find = false;
			for (int i = 0; i < keys.length; i++) {
				if (keys[i].length() > s.length()) {
					System.out.println("NO");
					return;
				}
				if (keys[i].equals(s.substring(s.length() - keys[i].length(), s.length()))) {
					// if (s.endsWith(keys[i])) {
					s = s.substring(0, s.length() - keys[i].length());
					find = true;
					break;
				}
			}
			if (!find) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}

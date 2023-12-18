import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next(); // dream, dreamer, erase, eraser

			StringBuilder sb = new StringBuilder(s);
			sb.reverse(); // maerd, remaerd, esare, resare
			s = sb.toString();
			boolean result = true;

			while (s.length() > 0) {
				if (s.substring(0, 5).equals("maerd")) {
					s = s.substring(5);
				} else if (s.substring(0, 7).equals("remaerd")) {
					s = s.substring(7);
				} else if (s.substring(0, 5).equals("esare")) {
					s = s.substring(5);
				} else if (s.substring(0, 6).equals("resare")) {
					s = s.substring(6);
				} else {
					System.out.println("NO");
					result = false;
					break;
				}
			}
			if (result == true) {
				System.out.println("YES");
			}
		}
	}
}
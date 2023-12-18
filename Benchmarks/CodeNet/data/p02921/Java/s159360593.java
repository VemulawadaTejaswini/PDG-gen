
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = sc.next();

			char[] sa = s.toCharArray();
			char[] st = t.toCharArray();

			int result = 0;
			for (int i = 0; i < 3; i++) {
				if (sa[i] == st[i]) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}

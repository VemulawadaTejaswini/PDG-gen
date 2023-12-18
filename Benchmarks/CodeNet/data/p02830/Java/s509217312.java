
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			String t = sc.next();
			StringBuilder result = new StringBuilder();

			for (int i = 0; i < n; i++) {
				result.append(s.charAt(i));
				result.append(t.charAt(i));
			}
			System.out.println(result);
		}
	}
}

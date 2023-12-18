import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		for (int i = 0 ; i <= a + b ; i++) {
			char t = s.charAt(i);
			if (i != a && Character.isDigit(t)) {
				System.out.println("No");
				System.exit(0);
			} else if (i == a && t == '-') {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}

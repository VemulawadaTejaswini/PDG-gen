import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		for (int i = 0 ; i <= a+b ; i++) {
			if (i != a && !Character.isDigit(s.charAt(i))) out();
			else if (s.charAt(i) != '-') out();
		}
		System.out.println("Yes");
	}

	private static void out() {
		System.out.println("No");
		System.exit(0);
	}
}

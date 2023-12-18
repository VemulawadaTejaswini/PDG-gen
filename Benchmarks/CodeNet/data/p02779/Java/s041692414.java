import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int a = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					a += 1;
				}
			}
		}
		if (a == 0) {
			System.out.println("Yes");
		} else if (a >= 1) {
			System.out.println("No");
		}
	}
}

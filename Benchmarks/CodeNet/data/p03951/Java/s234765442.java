import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(n - i - 1) != t.charAt(i)) {
				break;
			}
			count++;
		}

		if (s.equals(t)) {
			System.out.println(s.length());
		} else {
			System.out.println(s.length() + t.length() - count);
		}
	}
}
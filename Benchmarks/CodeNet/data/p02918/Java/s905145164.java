import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();

		int r = 0;
		char t = s.charAt(0);
		for (char c : s.toCharArray()) {
			if (t != c) {
				r += 1;
				t = c;
			}
		}
		System.out.println(n - 1 - Math.max(0, r - k * 2));
	}
}
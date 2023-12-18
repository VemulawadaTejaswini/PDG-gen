import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		String[] h = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for (int i = 0; i < 26; i++) {
			if (!s.contains(h[i])) {
				System.out.println(h[i]);
				sc.close();
				return;
			}
		}
		
		System.out.println("None");

		sc.close();
	}
}

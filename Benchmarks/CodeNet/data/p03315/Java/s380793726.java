import  java.util.*;

public class Main {
	public static void main(String[] args) {
		final int SLength = 4;
		int ans = 0;
		String s;

		Scanner scan = new Scanner(System.in);
		s = scan.next();

		for (int i = 0 ; i < SLength; i++) {
			if (s.charAt(i) == '+') {
				ans++;
			} else if (s.charAt(i) == '-') {
				ans--;
			}

		}

		System.out.println(ans);

	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int N = S.length();
		boolean ret = isPalindrome(S);
		ret &= isPalindrome(S.substring(0, (N - 1) / 2));
		ret &= isPalindrome(S.substring((N + 1) / 2));

		System.out.println(ret ? "Yes" : "No");
	}

	static boolean isPalindrome(String s) {
		int N = s.length();
		for ( int i = 0 ; i < N / 2 ; i++ ) {
			if ( s.charAt(i) != s.charAt(N - i - 1) ) {
				return false;
			}
		}
		return true;
	}
}

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			String s = in.nextLine();
			solve(s);
		}
	}

	public static void solve(String s) {
		int n = 'Z' - 'A' + 1;
		boolean solved = false;
		for(int i=0;i<=n;i++) {
			String ans = "";
			for(int j=0;j<s.length();j++) {
				int offset = i;
				int ch = s.charAt(j);
				if((int)'a' <= (int)s.charAt(j) && (int)s.charAt(j) <= (int)'z') {
					ans += (Character.toString((char) ((int)'a' + (ch -(int)'a' + offset) % n)));
				} else {
					ans += Character.toString((char)ch);
				}
			}
			if(isEnd(ans)) {
				System.out.println(ans);
				solved = true;
				break;
			}
		}

		if (!solved) throw new AssertionError();
	}

	public static boolean isEnd(String ans) {
		return ans.contains("the") ||
				ans.contains("this") ||
				ans.contains("that")
//		return ans.contains("the ") ||
//					ans.contains("this ") ||
//					ans.contains("that ") ||
//					ans.contains("the.") ||
//					ans.contains("this") ||
//					ans.contains("that.")||
//				(ans.contains("the") && ans.length() == 3) ||
//				(ans.contains("this") && ans.length() == 4) ||
//				(ans.contains("that") && ans.length() == 4)
				;
	}
}
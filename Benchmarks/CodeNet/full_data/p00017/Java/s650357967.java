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
		int n = 'Z' - 'A';
		for(int i=0;i<=n;i++) {
			String ans = "";
			for(int j=0;j<s.length();j++) {
				int offset = i;
				int ch = s.charAt(j);
				if('a' <= s.charAt(j) && s.charAt(j) <= 'z') {
					ans += (Character.toString((char) ((int)'a' + (ch -(int)'a' + offset) % n)));
				} else {
					ans += Character.toString((char)ch);
				}
			}
			if(ans.contains("the ") ||
					ans.contains("this ") ||
					ans.contains("that ") ||
					ans.contains("the.") ||
					ans.contains("this.") ||
					ans.contains("that.")
					) {
				System.out.println(ans);
				break;
			}
		}
	}
}
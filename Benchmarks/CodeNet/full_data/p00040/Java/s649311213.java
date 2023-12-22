import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++) {
			String s = in.nextLine();
			System.out.println(solve(s));
		}
	}
	public static String solve(String s) {
		List<String> keywords = new ArrayList<>();
		for(int a=0;;a++) {
			if(a % 2 == 0 || a % 13 == 0) continue;
			for (int b = 0; b <= 300; b++) {
				String str = "";
				for(int k=0;k<s.length();k++) {
					if(s.charAt(k) == ' ') {
						str += " "; continue;
					}
					str += F(s.charAt(k), a, b);
				}
				if(str.contains("that") || str.contains("this")) {
					return str;
				}
			}
		}
	}

	public static String F(char ch, int alpha, int beta) {
		int gamma = ch - 'a';
		return ""+((char)('a' + (alpha*gamma + beta) % 26));
	}
}
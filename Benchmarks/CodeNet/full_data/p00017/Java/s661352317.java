import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static String decipher(String s, int n) {
		char[] cs = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= cs[i] && cs[i] <= 'z') {
				int c = (int)cs[i] + n;
				if (c > (int)'z') {
					c = c - (int)'z' + (int)'a' - 1;
				}
				cs[i] = (char)c;
			}
		}
		return String.valueOf(cs);
	}
	
	public static Boolean check(String s) {
		if (s.indexOf("the") != -1) return true;
		if (s.indexOf("this") != -1) return true;
		if (s.indexOf("that") != -1) return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while(!(input = reader.readLine()).isEmpty()){
			for (int i = 0; i < 26; i++) {
				String s = decipher(input, i);
				if (check(s)) {
					System.out.println(s);
					break;
				}
			}
		}
	}

}
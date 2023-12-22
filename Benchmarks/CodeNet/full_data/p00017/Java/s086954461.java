import java.io.*;

public class Main {
	
	public static String decode (String str) {
		
		String ret = "";
		
		for (int i = 1; i <= 25; i++) {
			ret = "";
			String temp = "";
			boolean flag = false;
			for (int j = 0; j < str.length(); j++) {
				if (0 <= str.charAt(j) - 'a' && str.charAt(j) - 'a' <= 25) {
					temp += (char)((str.charAt(j) - 'a' + i) % 26 + 'a');
					ret += (char)((str.charAt(j) - 'a' + i) % 26 + 'a');
				} else {
					ret += str.charAt(j);
					if (temp.equals("the") || temp.equals("this") || temp.equals("that")) {
						flag = true;
					}
					temp = "";
				}
			}
			if (flag) {
				return ret;
			}
		}
		
		return null;
	}
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(decode(str));
		}
		
	}
	
}
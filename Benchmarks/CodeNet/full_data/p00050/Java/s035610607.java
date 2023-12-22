import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String buf = br.readLine();
			StringTokenizer st = new StringTokenizer(buf);

			int c = 0;
			String s[] = new String[500];
			buf.replaceAll("apple","peach").replaceAll("peach","apple");
			while (st.hasMoreTokens()) {
				s[c] = st.nextToken();
				if (s[c].indexOf("peach")==0) {
					String t = "apple";
					for (int i=5;i<s[c].length();i++) t = t+s[c].charAt(i);
					s[c] = t;
				} else if (s[c].indexOf("apple")==0) {
					String t = "peach";
					for (int i=5;i<s[c].length();i++) t = t+s[c].charAt(i);
					s[c] = t;
				}
				c++;
			}
			String ans = s[0];
			for (int i=1;i<c;i++) {
				ans = ans+" "+s[i];
			}
			System.out.println(ans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
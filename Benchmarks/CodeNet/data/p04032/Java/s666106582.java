import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int start = -1;
		int end = -1;
		char ch = 'a';
		for (int i = 0; i < 26; i++) {
			String s = String.valueOf(ch);
			Pattern p = Pattern.compile(s + s + "|" + s + "." + s);
			Matcher m = p.matcher(line);
			if (m.find()) {
				start = m.start() + 1;
				end = m.end();
				break;
			}
			ch++;
		}
		System.out.println(start + " " + end);
	}
}

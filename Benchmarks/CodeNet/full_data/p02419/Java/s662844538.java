import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int cnt = 0;
		while (true) {
			String str = br.readLine();
			if (str.equals("END_OF_TEXT")) {
				break;
			}
			Pattern p = Pattern.compile("\\b" + word + "\\b");
			Matcher m = p.matcher(str);
			while (m.find()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
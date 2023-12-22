import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String str = getSentence(br);
		int cnt = 0;
		Pattern p = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		while (m.find()) {
			cnt++;
		}
		System.out.println(cnt);
	}

	private static String getSentence(BufferedReader br) throws Exception {
		StringBuilder sb = new StringBuilder(1000);
		while (true) {
			String str = br.readLine();
			if (str.equals("END_OF_TEXT")) break;
			sb.append(str);
		}
		String str = sb.toString().replaceAll("\\s", "");
		str = sb.toString().replaceAll("\\r", "");
		return str;
	}
}
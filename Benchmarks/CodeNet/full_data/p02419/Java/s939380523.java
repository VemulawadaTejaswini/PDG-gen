import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine();
		int count = 0;
		Pattern p = Pattern.compile(w, Pattern.CASE_INSENSITIVE);
		while (true) {
			String t = br.readLine();
			if (t.equals("END_OF_TEXT")) break;
			Matcher m = p.matcher(t);
			while (m.find()) count++;
		}
		System.out.println(count);
	}
}
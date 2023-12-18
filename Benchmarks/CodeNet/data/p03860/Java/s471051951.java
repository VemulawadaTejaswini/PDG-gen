import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(shorten(in.readLine()));
	}

	static String shorten(String src) {
		final Pattern p = Pattern.compile("AtCoder ([A-Z])[a-z]{0,99} Contest");
		final Matcher m = p.matcher(src);
		if (m.find()) {
			return m.replaceAll("A$1C");
		}
		throw new IllegalArgumentException();
	}
}

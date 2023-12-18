import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int ans = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			ans += count(s);

			String str[] = s.split("");
			if (str[0].equals("B")) {
				b++;
			}
			if (str[str.length - 1].equals("A")) {
				a++;
			}
		}

		System.out.println(ans + Math.min(a, b));
	}

	static int count(String str) {
		int i = 0;
		Pattern p = Pattern.compile("AB");
		Matcher m = p.matcher(str);
		while (m.find()) {
			i++;
		}
		return i;
	}
}

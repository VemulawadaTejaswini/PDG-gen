
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String t = br.readLine();

		int len = s.length();

		for (int i = 0; i < 26; i++) {
			if (t.charAt(i) != s.charAt(i)) {
				char temp='0';
				char tchar=t.charAt(i);
				t=t.replace(t.charAt(i), temp);
				t=t.replace(s.charAt(i), tchar);
				t=t.replace(temp, s.charAt(i));
			}
		}

		if (s.equals(t)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
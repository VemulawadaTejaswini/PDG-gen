import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int ec = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('E' == s.charAt(i))
				ec++;
		}

		int cc = ec;
		if ('E' == s.charAt(0)) cc--;
		int min = cc;
		for (int i = 0; i < s.length() - 1; i++) {
			if ('W' == s.charAt(i))
				cc++;
			if ('E' == s.charAt(i + 1))
				cc--;
			min = Math.min(min, cc);
		}

		System.out.println(min);

	}

}

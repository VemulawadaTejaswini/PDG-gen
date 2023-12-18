import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int w = Integer.parseInt(br.readLine());

		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (i % w == 0) {
				ans.append(s.charAt(i));
			}
		}

		System.out.println(ans);

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int a;
		int b;
		try {
			// Scanner sc = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			while (reader != null) {
				String s = new String(reader.readLine());
				String[] result1 = s.split(" ");
				a = Integer.parseInt(result1[0]);
				b = Integer.parseInt(result1[1]);

				int ans = a + b;
				String stAns = Integer.toString(ans);
				int count = stAns.substring(0).length();
				System.out.println(count);

			}
		} catch (IOException e) {
		}

	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufReader =
				new BufferedReader(new InputStreamReader(System.in));
		String read = null;
		while ((read = bufReader.readLine()) != null) {
			int n = Integer.parseInt(read);

			int c = 0;
			l1 : for (int i = 2; i <= n; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						continue l1;
					}
				}
				++c;
			}
			System.out.println(c);
		}
	}

}
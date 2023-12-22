import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int c1, c2, c3, c4;
			c1 = c2 = c3 = c4 = 0;
			for (char c : line.toCharArray()) {
				c1++;
				if (c >= '0' && c <= '9') {
					c2++;
				} else if (c >= 'A' && c <= 'Z') {
					c3++;
				} else {
					c4++;
				}
			}
			if (c1 > 5 && c2 > 0 && c3 > 0 && c4 > 0) {
				System.out.println("VALID");
			} else {
				System.out.println("INVALID");
			}
		}
	}
}
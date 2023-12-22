import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lunch
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		short p1, p2, p3, j1, j2;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			p1 = Short.parseShort(line);
			p2 = Short.parseShort(br.readLine());
			p3 = Short.parseShort(br.readLine());
			j1 = Short.parseShort(br.readLine());
			j2 = Short.parseShort(br.readLine());

			System.out.println((int) Math.min(Math.min(p1, p2), p3)
					+ (int) Math.min(j1, j2) - 50);
		}
	}
}
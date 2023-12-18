import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String l1 = r.readLine();

		if (l1.charAt(0) != l1.charAt(1) || l1.charAt(1) != l1.charAt(2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		r.close();
	}
}
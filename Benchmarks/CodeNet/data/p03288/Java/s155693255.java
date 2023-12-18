import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r = Integer.parseInt(br.readLine());

		if (r < 1200) {
			System.out.println("ABC");
		} else if (r < 2800) {
			System.out.println("ARC");
		} else {
			System.out.println("AGC");
		}

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n <= 599) {
			System.out.println("8");
		} else if (n <= 799) {
			System.out.println("7");
		} else if (n <= 999) {
			System.out.println("6");
		} else if (n <= 1199) {
			System.out.println("5");
		} else if (n <= 1399) {
			System.out.println("4");
		} else if (n <= 1599) {
			System.out.println("3");
		} else if (n <= 1799) {
			System.out.println("2");
		} else if (n <= 1999) {
			System.out.println("1");
		}
	}
}
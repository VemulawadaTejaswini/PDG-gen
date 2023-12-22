import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arrStrL = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");
		int a = Integer.parseInt(arrStrL[0]);
		int b = Integer.parseInt(arrStrL[1]);

		System.out.println((a * b) + " " + (2 * a + 2 * b));
	}
}
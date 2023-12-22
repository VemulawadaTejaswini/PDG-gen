import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static double debt = 100;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int n, hell;

		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (isNumber(s)) {
			n = Integer.parseInt(s);
			if (n >= 0 && n <= 100) {
				hell = (int) Math.ceil(debt * Math.pow(1.05, n));
				System.out.println(hell * 1000);
			}
		}
	}

	private static boolean isNumber(String s) {

		try {
			int n = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
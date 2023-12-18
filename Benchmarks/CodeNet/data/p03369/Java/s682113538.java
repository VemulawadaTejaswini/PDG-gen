
import java.io.*;

class Main {

	public static void main (String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int value = 0;

		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'o') {
				value += 100;
			}
		}

		System.out.println(500 + value);

	}
}
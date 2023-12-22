import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String s = br.readLine();
		char[] array = new char[s.length()];

		int i = 0;
		while (i < s.length()) {
			array[i] = s.charAt(i);
			++i;
		}

		while (--i >= 0) {
			System.out.print(array[i]);
		}

		System.out.println("");
	}
}
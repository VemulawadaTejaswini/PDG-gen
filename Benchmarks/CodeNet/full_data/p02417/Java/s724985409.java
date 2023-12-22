import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		char[] line;
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String s = stdIn.readLine();
		StringBuilder sb = new StringBuilder();
		while (s != null) {
			sb.append(s);
			s = stdIn.readLine();
		}
		line = sb.toString().toLowerCase().toCharArray();
		

		for (int i = 0; i < 26; i++) {
			int count = 0;

			for (char c : line) {
				if (c == alphabets[i]) {
					count++;
				}
			}
			System.out.println(alphabets[i] + " : " + count);
		}
		stdIn.close();
	}

}
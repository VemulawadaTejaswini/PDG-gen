import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] counter = new int[26];

		String line;
		while ((line = br.readLine()) != null) {
			for (int i = 0; i < line.length() ; i++ ) {
				int value = line.charAt(i) - 'a';
				if (0 <= value && value <= 26) {
					counter[value]++;
				}
			}
		}

		for (int i = 0; i < 5 ; i++ ) {
			System.out.println((char)(i + 'a') + ":" + counter[i]);
		}
	}
}
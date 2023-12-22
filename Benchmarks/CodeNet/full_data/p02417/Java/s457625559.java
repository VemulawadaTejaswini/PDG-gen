import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		char[][] alphabet = new char[2][26];
		for (int i = 0; i < 26; i++) {
			alphabet[0][i] = (char) (i + 97);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			char[] input = str.toCharArray();
			for (int i = 0; i < input.length; i++) {
				int j = (int) input[i];
				if (64 < j && j < 91) j += 32;
				j -= 97;
				if (j < 0 || 27 < j) continue;
				alphabet[1][j]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println(String.valueOf(alphabet[0][i]) + " : " + (int) alphabet[1][i]);
		}
	}
}
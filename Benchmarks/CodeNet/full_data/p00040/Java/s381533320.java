import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AffineCipher {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for ( ; n > 0 ; n--) {
			String cipher = br.readLine();
			System.out.println(decrypt(cipher));
		}
	}

	public static String decrypt(String cipher) {
		char[] cipherdata = cipher.toCharArray();
		char[] decryptdata = new char[cipherdata.length];
		for (int a = 0; a < 26; a++) {
			if (a % 2 == 0 || a % 13 == 0) continue;
			for (int b = 0; b < 26; b++) {
				for (int i=0; i < cipherdata.length; i++) {
					if (cipherdata[i] == ' ') {
						decryptdata[i] = ' ';
					} else {
						decryptdata[i] =
								f_inverse(cipherdata[i], a, b);
					}
				}
				String decryption = String.valueOf(decryptdata);
				if (decryption.indexOf("that") != -1
						|| decryption.indexOf("this") != -1) {
					return decryption;
				}
			}
		}
		return "hoge";
	}

	private static char f_inverse(char y, int a, int b) {
//		y = f(x) = (a * x + b) % 26;
		y = (char) (y - 'a');
		char x;
		for (x = 0; x < 26; x++) {
			int fx = (a * x + b) % 26;
			if (y == fx) break;
		}
		return (char) (x + 'a');
	}
}
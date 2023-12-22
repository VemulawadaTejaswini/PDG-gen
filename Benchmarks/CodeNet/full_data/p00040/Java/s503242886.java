import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Main {

	public static String encodeByAffin(int a, int b, String str) {
		StringBuilder sb = new StringBuilder();
		int l = str.length();
		for (int i = 0 ; i < l ; i++) {
			char c = str.charAt(i);
			if (c == ' ') sb.append(' ');
			else {
				char cp = (char) ((a*(c-97)+b)%26 + 97);
				sb.append(cp);
			}
		}
		return sb.toString();
	}

	public static String decodeAffin(int a, int b, String crypt) {
		char[] table = new char[123];
		for (int i = 97 ; i < 123 ; i++) {
			table[(char) ((a*(i-97)+b)%26 + 97)] = (char) i;
		}
		int l = crypt.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < l ; i++) {
			char c = crypt.charAt(i);
			if (c == ' ') sb.append(' ');
			else sb.append(table[c]);
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();

		List<Integer> alphas = Arrays.asList(1,3,5,7,9,11,15,17,19,21,23,25);
		List<Integer> betas = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);


		int N = Integer.parseInt(br.readLine());
		for (int i = 0 ; i < N ; i++) {
			String crypt = br.readLine();
			int alpha = 0, beta = 0;
			LOOP: for (int a : alphas) {
				for (int b : betas) {
					String THIS = encodeByAffin(a, b, "this");
					String THAT = encodeByAffin(a, b, "that");
					if (crypt.contains(THIS) || crypt.contains(THAT)) {
						//System.out.println("a:"+a+" b:"+b);
						alpha = a; beta = b;
						break LOOP;
					}
				}
			}
			System.out.println(decodeAffin(alpha, beta, crypt));
		}

	}

}
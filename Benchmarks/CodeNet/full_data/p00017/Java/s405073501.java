import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		String alp = "abcdefghijklmnopqrstuvwxyz";
		char[] alpha = alp.toCharArray();
		try {
			while ((line = br.readLine()) != null) {
				line.trim();

				String[] words = line.replaceAll("//.", "").split("\\s");
				int a = 0;
				for (String s : words) {
					if (s.length() == 3 || s.length() == 4) {
						char[] c = s.toCharArray();
						int dd = Arrays.binarySearch(alpha, c[0]) - ('t' - 'a');
						if(dd < 0) dd += 26;
						if (c[1] == alpha[('h' - 'a' + dd) % 26] ) {
							if (s.length() == 3) {
								if (c[1] == alpha[('e' - 'a' + dd) % 26]){
									a = dd;
									break;
								}
							} else {
								if ((c[3] == c[0] && c[2] == alpha[('a' - 'a' + dd) % 26]) ||
									(c[3] == alpha[('s' - 'a' + dd) % 26] && c[2] == alpha[('i' - 'a' + dd) % 26])) {
									a = dd;
									break;
								}
							}
						}
					}
				}
				char[] decode = line.toCharArray();

				for (int i = 0; i < decode.length; i++) {
					if (decode[i] >= 'a' && decode[i] <= 'z') {
						if ((decode[i] - a) < 'a') {
							decode[i] = (char) (decode[i] - a + 26);
						} else if ((decode[i] - a) > 'z') {
							decode[i] = (char) (decode[i] - a - 26);
						} else {
							decode[i] = (char) (decode[i] - a);
						}
					}
				}
				System.out.println(decode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
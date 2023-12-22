import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				line.trim();

				String[] words = line.replaceAll("//.", "").split("\\s");
				int a = 0;
				for (String s : words) {
					if (s.length() == 3 || s.length() == 4) {
						char[] c = s.toCharArray();
						if (c[0] - 't' == c[1] - 'h') {
							if (s.length() == 3) {
								if (c[1] - c[2] == 'h' - 'e') {
									a = c[0] - 't';
									break;
								}
							} else {
								if (c[3] == c[0] || c[3] - c[0] == 's' - 't') {
									a = c[0] - 't';
									break;
								}
							}
						}
					}
				}
				char[] decode = line.toCharArray();

				for (int i = 0; i < decode.length; i++) {
					if (decode[i] >= 'a' && decode[i] <= 'z') {
						if ((decode[i] - a) < 'a')
							decode[i] = (char)(decode[i] - a + 26);
						else if ((decode[i] - a) > 'z')
							decode[i] = (char) (decode[i] - a - 26);
						decode[i] = (char) (decode[i] - a);
					}
				}
				System.out.println(decode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
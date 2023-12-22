import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String upperCase = br.readLine();
			char ch = 0;

			for(int i = 0; i < upperCase.length(); i++) {
				ch = upperCase.charAt(i);

				if(ch >= 'A' && ch <= 'Z') {
					ch += 32;
					System.out.printf("%c", (char)ch);
				} else if(ch >= 'a' && ch <= 'z') {
					ch -= 32;
					System.out.printf("%c", (char)ch);
				} else {
					System.out.printf("%c", (char)ch);
				}
			}
			System.out.printf("\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


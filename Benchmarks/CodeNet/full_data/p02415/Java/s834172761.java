import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		short size = (short) str.length();
		char[] charStr = str.toCharArray();
		for (int i = 0; i < size; i += 1) {
			if (Character.isLowerCase(charStr[i])) {
				charStr[i] = Character.toUpperCase(charStr[i]);
			} else if (Character.isUpperCase(charStr[i])) {
				charStr[i] = Character.toLowerCase(charStr[i]);
			}
		}
		System.out.println(charStr);
	}
}
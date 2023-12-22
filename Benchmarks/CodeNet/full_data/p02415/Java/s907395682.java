import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();

			char ch;
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				if (Character.isUpperCase(ch)) {
					System.out.print(Character.toLowerCase(ch));
				} else if (Character.isLowerCase(ch)){
					System.out.print(Character.toUpperCase(ch));
				} else {
					System.out.print(ch);
				}	
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
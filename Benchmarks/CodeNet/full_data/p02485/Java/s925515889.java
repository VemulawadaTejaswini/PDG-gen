import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int s = 0;
			while (true) {
				String line = reader.readLine();
				int i = 0;
				char c = line.charAt(i);
				if (c == '0')
					break;
				s += c;
				i++;
			}
			System.out.println(s);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
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
				if (line.charAt(0) == '0')
					break;

				int i = 0;
				while (i < args.length) {
					char c = line.charAt(i);
					s += c;
				}
				System.out.println(s);
				i++;
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
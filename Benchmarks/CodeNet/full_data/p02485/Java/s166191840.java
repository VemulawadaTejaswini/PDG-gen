import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String line = reader.readLine();
				int x = Integer.parseInt(line);
				if (x == 0) {
					break;
				}
				int sum = 0;

				for (int i = 0; i < line.length(); i++) {
					char a = line.charAt(i);
					int b = a - '0';
					sum += b;
				}
				System.out.println(sum);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
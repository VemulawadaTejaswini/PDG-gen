import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int a = Integer.parseInt(line);
			line = reader.readLine();
			int b = Integer.parseInt(line);
			System.out.println((a * b) + "" + (2 * (a + b)));
		} catch (IOException e) {
		} catch (NumberFormatException e) {
		}
	}
}
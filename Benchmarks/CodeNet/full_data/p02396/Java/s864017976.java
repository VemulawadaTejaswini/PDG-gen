import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		try {
			while ((line = reader.readLine()) != null) {
				int x = Integer.parseInt(line);
				if (x == 0)
					break;
				System.out.println("Case " + i + ":" + x);
				i++;
			}
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try (BufferedReader stdReader = new BufferedReader(
				new InputStreamReader(System.in))) {
			String line = null;
			while ((line = stdReader.readLine()) != null) {
				if (!line.equals("")) {
					int i = Integer.parseInt(line);
					System.out.print(i * i * i);
				}
				break;
			}
			stdReader.close();
			System.out.println();
		} catch (Exception e) {

		}
	}
}
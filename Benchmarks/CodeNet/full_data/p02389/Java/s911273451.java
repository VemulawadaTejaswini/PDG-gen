import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try (BufferedReader stdReader = new BufferedReader(
				new InputStreamReader(System.in))) {
			String line = null;
			while ((line = stdReader.readLine()) != null) {
				if (!line.equals("")) {
					String[] lineArray = line.split(" ");
					int tate = Integer.parseInt(lineArray[0]);
					int yoko = Integer.parseInt(lineArray[1]);
					System.out.print(tate * yoko);
					System.out.print(" " + ((tate * 2) + (yoko * 2)));
				}
				break;
			}
			System.out.println();
		} catch (Exception e) {

		}
	}
}
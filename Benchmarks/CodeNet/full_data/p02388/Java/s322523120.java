import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			int x_cube = Integer.parseInt(br.readLine());
			System.out.println((int)Math.pow(x_cube, 3));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}

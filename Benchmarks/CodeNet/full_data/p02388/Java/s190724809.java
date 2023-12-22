import java.io.*;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int x = Integer.parseInt(br.readLine());
			System.out.println((int) Math.pow(x, 3.0));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}

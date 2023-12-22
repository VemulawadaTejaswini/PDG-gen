import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(reader.readLine());
			System.out.println((int)Math.pow(num, 3));
		} catch (Exception e) {
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int X = Integer.parseInt(str);
		int amari = X % 100;
		int kosuu = X / 100;
		if (amari > 5 * kosuu) {
			System.out.println("0");
			return;
		}
		System.out.println("1");
		
	}
}

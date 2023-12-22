import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String line = reader.readLine();
				if (line.equals("0")) {
					break;
				} else {
					int length = line.length();
					int[] n = new int[length];
					int sum = 0;
					for (int i = 0; i < length; i++) {
						n[i] = line.charAt(i) - '0';
						sum += n[i];
					}
					System.out.println(sum);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

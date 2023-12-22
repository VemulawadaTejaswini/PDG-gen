import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int[] weights = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int stuff;
		StringBuilder sb = new StringBuilder();

		while ((line = br.readLine()) != null) {
			stuff = Integer.parseInt(line);

			for (int i = 0; i < 10; i++) {
				if ((stuff & weights[i]) == weights[i]) {
					sb.append(weights[i] + " ");
				}
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
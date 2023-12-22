import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int[] weights = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			int stuff = Integer.parseInt(line);
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 10; i++) {
				if ((stuff & weights[i]) > 0) {
					sb.append(weights[i] + " ");
				}
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
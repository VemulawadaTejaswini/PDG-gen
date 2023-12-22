import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line) >> 2;
			if (n == 0) {
				break;
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Integer.parseInt(br.readLine());
			}
			System.out.println(sum);
		}
	}
}
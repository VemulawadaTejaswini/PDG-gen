import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			int[] wait1 = new int[n];
			int[] wait2 = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				wait1[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(wait1);
			for (int i = 1; i < n; i++) {
				wait2[i] = wait1[i - 1] + wait2[i - 1];
				sum += wait2[i];
			}
			System.out.println(sum);
		}
	}
}
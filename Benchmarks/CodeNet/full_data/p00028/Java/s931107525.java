import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] occur = new int[100];
		int max = 0;

		Arrays.fill(occur, 0);

		while ((line = br.readLine()) != null) {
			int i = Integer.parseInt(line);
			int j = occur[i - 1] += 1;
			max = j > max ? j : max;
		}
		for (int i = 0; i < 100; i++) {
			if (occur[i] == max)
				System.out.println(i + 1);
		}
	}
}
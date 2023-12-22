import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			int n = Integer.parseInt(line);
			int sum, max;
			int[] num = new int[n];
			//
			for (int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			//
			max = 0;
			for (int i = 0; i < n; i++) {
				sum = 0;
				for (int j = i; j < n; j++) {
					sum += num[j];
					if (sum > max)
						max = sum;
				}
			}
			System.out.println(max);
		}
	}
}
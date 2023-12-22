import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] price = new int[n];

		for (int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}

		int max = - Integer.MIN_VALUE;
		int minPrice = price[0];
		for (int i = 1; i < n; i++) {
			if (max < price[i] - minPrice) {
				max = price[i] - minPrice;
			}
			if (minPrice > price[i]) {
				minPrice = price[i];
			}
		}
		System.out.println(max);
	}
}
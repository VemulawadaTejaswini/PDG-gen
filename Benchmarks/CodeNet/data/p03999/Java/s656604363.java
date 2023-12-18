import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		long sum = 0;
		long temp = 0;

		for (int i = 0; i < (1 << (str.length - 1)); i++) {
			temp = Integer.parseInt(str[0]);
			for (int j = 0; j < (str.length - 1); j++) {
				if ((i & (1 << j)) != 0) {
					sum += temp;
					temp = 0;
				}

				temp = temp * 10 + (Integer.parseInt(str[j + 1]));
			}
			sum += temp;
		}

		System.out.println(sum);
	}
}

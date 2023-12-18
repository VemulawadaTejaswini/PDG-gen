

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int n = Integer.parseInt(str);
		int[] list = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			str = input.readLine();
			list[i] = Integer.parseInt(str);
			sum = sum + list[i];
		}

		Arrays.sort(list);
		int j = 0;
		while (sum % 10 == 0 && j < n) {
			if (list[j] % 10 != 0) {
				sum = sum - list[j];
				j++;
			}
		}

		System.out.println(sum);

	}
}

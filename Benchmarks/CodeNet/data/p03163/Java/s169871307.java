package paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());

		int weight[] = new int[n];
		int value[] = new int[n];

		for (int i = 0; i < n; i++) {
			String tmp[] = br.readLine().split(" ", 0);
			weight[i] = Integer.parseInt(tmp[0]);
			value[i] = Integer.parseInt(tmp[1]);
		}

		int sumValue[][] = new int[n + 1][max + 1];

		for (int i = 0; i < n; i++) {
			for (int w = 0; w <= max; w++) {
				if (w >= weight[i]) {
					sumValue[i + 1][w] = Math.max(sumValue[i][w], sumValue[i][w - weight[i]] + value[i]);
				} else {
					sumValue[i + 1][w] = sumValue[i][w];
				}
			}
		}
		System.out.println(sumValue[n][max]);
	}
}
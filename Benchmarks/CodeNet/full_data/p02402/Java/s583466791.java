import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int max = num[0];
		int min = num[0];
		int sum = 0;
		for (int a : num) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
			sum += a;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}


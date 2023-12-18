import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers[] = br.readLine().split(" ");
		int n = Integer.parseInt(numbers[0]);
		int x = Integer.parseInt(numbers[1]);
		String length[] = br.readLine().split(" ");
		int len[] = new int[n];
		for (int i = 0; i < n; i++) {
			len[i] = Integer.parseInt(length[i]);
		}
		int bounces[] = new int[n + 1];
		bounces[0] = 0;
		for (int j = 1; j <= len.length; j++) {
			bounces[j] = bounces[j - 1] + len[j - 1];
		}
		int count = 0;
		for (int k = 0; k < bounces.length; k++) {
			if (bounces[k] <= x) {
				count++;
			}
		}
		System.out.println(count);
	}

}
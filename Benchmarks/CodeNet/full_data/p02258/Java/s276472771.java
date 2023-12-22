import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()), maximum = Integer.MIN_VALUE;
		int[] timeRate = new int[n];
		for (int i = 0; i < n; i++) {
			timeRate[i] = Integer.parseInt(in.readLine());
		}
		for (int x = 0; x < n; x++) {
			for (int y = x + 1; y < n; y++) {
				int temp = timeRate[y] - timeRate[x];
				if (temp > maximum) {
					maximum = temp;
				}
			}
		}
		System.out.println(maximum);
	}
}
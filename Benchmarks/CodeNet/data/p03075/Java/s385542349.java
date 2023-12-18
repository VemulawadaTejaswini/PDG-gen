import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		for (int i = 0; i < 4; i++) {
			if (a[i + 1] - a[i] > k) {
				System.out.println(":(");
				return;
			}
		}

		System.out.println("Yay!");
	}
}

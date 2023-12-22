import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int mid = n / 2;
		int red = 0;
		int white = 0;

		if (n % 2 != 0) {
			for (int i = 0; i <= mid; i++) {
				if (str[i].equals("W")) {
					white++;
				}
			}
		} else {
			for (int i = 0; i < mid; i++) {
				if (str[i].equals("W")) {
					white++;
				}
			}
		}

		if (n % 2 != 0) {
			for (int i = mid + 1; i < n; i++) {
				if (str[i].equals("R")) {
					red++;
				}
			}
		} else {
			for (int i = mid; i < n; i++) {
				if (str[i].equals("R")) {
					red++;
				}
			}
		}

		System.out.println(Math.min(red, white));
	}
}
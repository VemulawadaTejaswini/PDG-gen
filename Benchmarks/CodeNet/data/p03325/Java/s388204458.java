import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			int temp = 0;

			while (a[i] % 2 == 0) {
				temp++;
				a[i] /= 2;
			}
			count += temp;
		}

		System.out.println(count);
	}
}

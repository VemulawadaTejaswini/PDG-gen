import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int b[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		b = a.clone();

		Arrays.sort(a);
		int first = a[n - 1];
		int second = a[n - 2];

		for (int i = 0; i < n; i++) {
			if (b[i] == first) {
				System.out.println(second);
			} else {
				System.out.println(first);
			}
		}
	}
}

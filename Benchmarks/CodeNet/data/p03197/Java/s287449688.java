import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long even = 0;
		long odd = 0;
		long sum = 0;
		long count = 0;

		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(br.readLine());
			sum += a;
			if (a % 2 == 0)
				even++;
			else
				odd++;

			if (a == 1)
				count++;
		}

		if (count == n) {
			System.out.println("first");
			return;
		}

		if (odd % 2L == 0 || sum % 2 != 0) {
			System.out.println("second");
		} else {
			System.out.println("first");
		}
	}
}
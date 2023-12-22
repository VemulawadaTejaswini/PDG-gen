import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long c = Long.parseLong(str[2]);
		long d = Long.parseLong(str[3]);

		if (b < 0 && d < 0) {
			System.out.println(a * c);
		} else if (a > 0 && c > 0) {
			System.out.println(b * d);
		} else {
			long A = a * c;
			long B = b * d;
			long C = a * d;
			long D = b * c;

			long max = Long.MIN_VALUE;
			max = Math.max(max, A);
			max = Math.max(max, B);
			max = Math.max(max, C);
			max = Math.max(max, D);
			System.out.println(max);
		}
	}
}
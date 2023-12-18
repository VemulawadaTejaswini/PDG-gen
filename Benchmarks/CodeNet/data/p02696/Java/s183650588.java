import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long n = Long.parseLong(str[2]);

		double c = Math.floor(a * n / b);
		double d = Math.floor(n / b);

		System.out.println((long) (c - a * d));
	}
}
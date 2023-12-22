import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long n = Long.parseLong(str);
		System.out.print(n + ":");
		long div = n;
		long i;
		Boolean isBig = true;
		for (i = 2; isBig; i++) {
			if (div % i == 0) {
				div = div / i;
				System.out.print(" " + i);
				i--;
				isBig = i <= div;
			}
		}
		System.out.println();
	}
}
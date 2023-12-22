import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		call(n);
	}

	private static void call(long n) {
		write(n);
		System.out.println();
	}

	private static void write(long n) {
		if (n > 1){
			write(n - 1);
		}
		if(n % 3 == 0 || String.valueOf(n).indexOf("3") != -1){
			System.out.printf(" %d", n);
		}
	}

}
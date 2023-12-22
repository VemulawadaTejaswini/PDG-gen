import java.io.*;
import static java.lang.System.out;

public final class Main {
	public static void main(String[] args) throws IOException {
		try (var istr = new InputStreamReader(System.in);
			 var br = new BufferedReader(istr)) {
			long k = Long.parseLong(br.readLine());
			long i = 100;
			int years = 0;
			while (i <= k) {
				i += (.01 * i);
				years += 1;
			}
			out.printf("%d%n", years);
		}
	}
}
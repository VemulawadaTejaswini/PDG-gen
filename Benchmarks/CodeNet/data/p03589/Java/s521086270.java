import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		br.close();

		for (long h = 1; h <= 3500; h++) {
			for (long n = 1; n <= 3500; n++) {
				long x = h*n*N;
				long y = 4*h*n - n*N - h*N;
				if (y > 0 && x % y == 0) {
					System.out.println(h + " " + n + " " + x/y);
					return;
				}
			}
		}
	}
}

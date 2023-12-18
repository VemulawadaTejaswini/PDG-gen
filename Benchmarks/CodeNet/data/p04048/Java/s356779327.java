import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
		
	}
	
	private static void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		long N = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		long X = Integer.parseInt(str.substring(str.indexOf(" ") + 1, str.length()));
		
		if (X < (double) N / 2) {
			System.out.println(4 * (N - X));
		} else if (N % 2 == 0 && X == N / 2) {
			System.out.println(3 * X);
		} else {
			System.out.println(4 * N - 3 * X);
		}
		
	}
}

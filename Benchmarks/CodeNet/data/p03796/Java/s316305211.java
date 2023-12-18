import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		long pow = 1;
		for (int i = 0; i < N; i++) {
			pow = pow * (i + 1) % 1_000_000_007;
		}
		System.out.println(pow);
	}
}

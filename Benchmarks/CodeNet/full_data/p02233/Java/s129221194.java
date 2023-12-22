import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		reader.close();
		System.out.println(fibonacci(n));
	}
	private int fibonacci(int n) {
		if (n < 2) return 1;
		int f[] = new int[n+1];
		f[0] = f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}

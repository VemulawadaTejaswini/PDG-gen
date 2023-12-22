import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = reader.readLine()) != null) {
			int ans = 0;
			int n = Integer.parseInt(str);
			for (int i = 2; i <= n; i++) {
				if (isPrimeNumber(i)) ans++;
			}
			System.out.println(ans);
		}
		reader.close();
	}

	private boolean isPrimeNumber(int n) {
		if (n <= 1) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		for (int i = 3; i <= Math.sqrt(n); i+=2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}

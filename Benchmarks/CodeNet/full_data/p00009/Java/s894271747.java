import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int N = 1000000;
		boolean[] primes = new boolean[N];
		int[] counts = new int[N];

		for (int i = 2; i < N / 2 + 1; i++) {
			if (!primes[i]) {
				for (int j = 2; j < N / i + 1; j++) {
					if (!primes[i * j]) {
						primes[i * j] = true;
					}
				}
			}
		}
		int count = 0;
		for (int i = 2; i < N; i++) {
			if (!primes[i]) {
				count++;
			}
			counts[i] = count;
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(counts[Integer.parseInt(line)]);
		}
	}
}
import java.util.Scanner;

public class Main {
	final int MAX_N = 100000000;
	boolean[] primes;
	void eratosthenes() {
		primes = new boolean[MAX_N + 1];
		for (int i = 2; i <= MAX_N; i++)
			primes[i] = true;
		for (int i = 2; i <= MAX_N; i++)
			for (int j = i * 2; j < Math.sqrt(MAX_N); j += i)
				primes[j] = false;
	}
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int v = scan.nextInt();
			ans += primes[v] ? 1 : 0;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.eratosthenes();
		main.run();
	}
}


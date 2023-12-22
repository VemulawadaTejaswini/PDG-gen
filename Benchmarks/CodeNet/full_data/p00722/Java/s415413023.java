import java.util.*;


public class Main {
	
	int a, d, n;
	
	final int N_MAX = 1000000;
	int[] sieve = new int[N_MAX + 1];
	
	void initSieve() {
		sieve[1] = 1;
		for (int i = 2; i < sieve.length; i++) {
			if (sieve[i] == 0) {
				for (int j = i * 2; j < N_MAX + 1; j += i) {
					sieve[j] = 1;
				}
			}
		}
	}
	
	int solve() {
		int primes = 0;
		int i;
		for (i = a; i < N_MAX; i += d) {
			if (sieve[i] == 0) {
				primes++;
				if (primes == n) {
					break;
				}
			}
		}
		return i;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		initSieve();
		while (sc.hasNext()) {
			a = sc.nextInt();
			d = sc.nextInt();
			n = sc.nextInt();
			if (a == 0 && d == 0 && n == 0) {
				break;
			} else {
				output += solve() + "\n";
			}
		}
		sc.close();
		System.out.print(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
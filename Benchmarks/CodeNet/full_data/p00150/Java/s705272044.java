import java.util.Scanner;
import java.util.Arrays;

public class Main {
	final static int MAX = 10000;
	public static void main(String args[]) {
		new Main().run();
	}
	
	void run() {
		Scanner in = new Scanner(System.in);
		boolean[] prime = new boolean[MAX + 1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for(int i = 2; i <= MAX; i++)
			if(prime[i])
				for(int j = 2 * i; j <= MAX; j += i)
					prime[j] = false;
		while(true) {
			int N = in.nextInt();
			if(N == 0) break;
			for(int i = N; i > 0; i--) {
				if(prime[i] && prime[i - 2]) {
					System.out.printf("%d %d\n", i - 2, i);
					break;
				}
			}
		}
	}
}
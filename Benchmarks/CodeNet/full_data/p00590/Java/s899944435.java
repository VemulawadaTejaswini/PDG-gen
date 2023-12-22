import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		boolean[] primes = new boolean[10001];
		primes[0] = primes[1] = true;
		for (int i = 2; i <= 10000; i++) {
			if (primes[i]) continue;
			for (int j = i+i; j <= 10000; j += i)
				primes[j] = true;
		}
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int res = 0;
			for (int i = 1; i <= n; i++) {
				if (!primes[i] && !primes[n-i+1]) res++;
			}
			out.println(res);
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
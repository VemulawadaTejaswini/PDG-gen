import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int segment_sieve(int a, int b) {
		int p = 0;
		int square_b = (int)Math.sqrt(b);
		boolean[] is_small_prime = new boolean[square_b+1];
		boolean[] is_prime = new boolean[b-a+1];
		is_small_prime[0] = is_small_prime[1] = true;
		for (int i = 2; i <= square_b; i++) {
			if (!is_small_prime[i]) {
				for (int j = 2*i; j <= square_b; j += i)
					is_small_prime[j] = true;
				for (int j = Math.max(2,(a+i-1)/i)*i; j <= b; j += i)
					is_prime[j-a] = true;
			}
		}
		
		for (boolean f: is_prime)
			if (!f) p++;
		
		return p;
	}
	
	void run() {
		int n; 
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			out.println(segment_sieve(n+1, 2*n));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}
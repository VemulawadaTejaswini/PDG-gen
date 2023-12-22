import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;


public class Main {
	
	ArrayList<Integer> primes;
	int N = 10000000;
	
	void prime() {
		boolean[] p = new boolean[N+1];
		for(int i=2;i<=N;i++) if( !p[i] ) {
			primes.add(i);
			for(int j=2*i;j<=N;j+=i) p[j] = true;
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		primes = new ArrayList<Integer>();
		prime();
		
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			int sum = 0;
			for(int i=0;i<n;i++) sum += primes.get(i);
			System.out.println(sum);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
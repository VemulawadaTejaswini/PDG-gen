
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			long n = sc.nextInt();
			if(n == 0) break;
			
			int r = 1;
			for(long i=2;i*i<=n;i++) if(n%i==0){
				r += i + n/i;
				if(i*i==n) r -= i;
			}
			if(n == 1) r--;
			if(r == n) System.out.println("perfect number");
			if(r < n) System.out.println("deficient number");
			if(r > n) System.out.println("abundant number");
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
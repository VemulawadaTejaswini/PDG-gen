
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, max;
	int[] items;
	boolean[] use;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt(); max = sc.nextInt();
			if((n|max) == 0) break;
			
			items = new int[n];
			for(int i=0;i<n;i++) items[i] = sc.nextInt();
			
			use = new boolean[max+1];
			use[0] = true;
			
			for(int i=0;i<=max;i++) for(int j=0;j<n;j++) if(i + items[j] <= max)
				use[i + items[j]] |= use[i];
			int ans = ans();
			System.out.println((ans < 0? "NA": ans));
		}
	}
	
	int ans() {
		for(int i=max;i>=1;i--) if(use[i] && isPrime(i))
			return i;
		return -1;
	}
	
	boolean isPrime(int x) {
		for(long j=2;j*j<=x;j++) if(x%j == 0) return false;
		return true;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		boolean p[] = new boolean[(1 << 15)+1];

		Arrays.fill(p, true);
		p[0] = false;
		p[1] = false;

		for (int i = 0; i < 1 << 8; i++) {
			if (p[i]) {
				for (int j = i + i; j < (1 << 15)+1; j += i) {
					p[j] = false;
				}
			}
		}

		int c = 0;
		for (int i = 0; i < (1 << 15)+1; i++) {
			c++;
		}
		int pr[] = new int[c];

		int c2 = 0;
		for (int i = 0; i <(1 << 15)+1; i++) {
			if (p[i]) {
				pr[c2] = i;
				c2++;
			}
		}

		int dp[] = new int[(1 << 15)+1];
//		System.out.println(Arrays.toString(pr));
		
		for (int i = 0; i < c; i++) {
			for (int j = i ; j<c&&pr[i] + pr[j] <= 1<<15; j++) {
				
				dp[pr[i] + pr[j]]++;
			}
		}

		
		for(;;){
			int n  =sc.nextInt();
			
			if(n==0){
				break;
			}
			System.out.println(dp[n]);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}
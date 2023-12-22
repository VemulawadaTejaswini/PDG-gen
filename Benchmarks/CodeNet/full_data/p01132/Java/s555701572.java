import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {
	
	int[] coint = {10, 50, 100, 500};
	int max = 20000;
	int INF = 1<<28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int v = sc.nextInt();
			if( v == 0 ) break;
			int[] coins = new int[4];
			int sum = 0;
			for(int i=0;i<4;i++) {
				coins[i] = sc.nextInt();
			}
			int[] ans = new int[4]; int min = INF;
			for(int i=0;i<=coins[0];i++) for(int j=0;j<=coins[1];j++) 
			for(int k=0;k<=coins[2];k++) for(int l=0;l<=coins[3];l++) {
				sum = i*coint[0] + j*coint[1] + k*coint[2] + l*coint[3] - v;
				if(sum < 0) continue;
				int cnt = 0;
				for(int m=3;m>=0;m--) {
					cnt += sum/coint[m];
					sum %= coint[m];
				}
				if( min > cnt ) {
					min = cnt;
					ans = new int[] {i, j, k, l};
				}
			}
			for(int i=0;i<4;i++) if(ans[i] > 0){
				System.out.println(coint[i] + " " + ans[i]);
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
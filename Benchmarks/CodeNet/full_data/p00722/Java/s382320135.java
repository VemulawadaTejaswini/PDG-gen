
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean dp[] = new boolean[1000001];

	void init() {
		Arrays.fill(dp, true);
		dp[0] = false;
		dp[1] = false;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i]) {
				for (int j = 2; j * i < dp.length; j++) {
					dp[j * i] = false;
				}
			}
		}
	}

	void run() {
		init();
		for (;;) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			if((a|d|n) == 0) {
				break;
			}
			int p = 0;
			int ret = 0;
			for(int k=a;p < n;k+=d){
				if(dp[k]){
					p++;
					ret = k;
				}
			}
			System.out.println(ret);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}
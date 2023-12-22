
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
	int len = 393;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n], l[] = new int[n], p[] = new int[n];
		for(int i=0;i<n;i++) {
			s[i] = sc.nextInt(); l[i] = sc.nextInt(); p[i] = sc.nextInt();
		}
		int[] dp = new int[len+1]; fill(dp, -1); dp[0] = 0;
		for(int j=0;j<=len;j++) for(int i=0;i<n;i++) if(dp[j] >= 0){
			for(int k=s[i];k<=l[i];k++) if(j+k<=len) dp[j+k] = max(dp[j+k], dp[j]+p[i]);
		}
		
		int m = sc.nextInt();
		int[] ans = new int[m];
		boolean flg = true;
		for(int i=0;i<m;i++) {
			int r=sc.nextInt();
			ans[i] = dp[r];
			if(ans[i] == -1) flg = false;
		}
		if(!flg) System.out.println(-1);
		else {
			for(int i: ans) System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
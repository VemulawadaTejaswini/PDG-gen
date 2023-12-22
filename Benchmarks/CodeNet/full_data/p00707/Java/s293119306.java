import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt(), h = sc.nextInt();
			if( (w|h) == 0 ) break;
			String[][] dp = new String[h+1][w+1];
			for(String[] a: dp) fill(a, "");
			String c = "";
			for(int i=1;i<=h;i++) {
				String l = sc.next();
				for(int j=1;j<=w;j++) if( '0' <= l.charAt(j-1) && l.charAt(j-1) <= '9' ){
					dp[i][j] = (isLarge(dp[i][j-1], dp[i-1][j])? dp[i][j-1]: dp[i-1][j]);
					if( l.charAt(j-1) != '0' || dp[i][j].length() != 0  ) dp[i][j] += l.charAt(j-1);
					if( isLarge(dp[i][j], c) ) c = dp[i][j];
				}
			}
			System.out.println(c);
		}
	}
	
	boolean isLarge(String a, String b) {
		if( a.length() != b.length() ) {
			return a.length()>b.length();
		}
		
		for(int i=min(a.length(), b.length())-1;i>=0;i--) {
			if( a.charAt(i) > b.charAt(i) ) return true;
			if( a.charAt(i) > b.charAt(i) ) return false; 
		}
		return false;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			long x = sc.nextLong();
			long ans = solve(n,x);
			System.out.println(ans);

			sc.close();
		}

		public static long solve(int n, long x) {
			
			long[]ans = new long[n+1];	
			ans[0] = 1;
			if (n != 0) {
				if (n >= x) {
					ans[n] = 0;
				}else{
					if (2 * x == depth(n) + 1) {
						return pathi(n-1) + 1;
					}else if(x * 2 > depth(n)){
						ans[n] = pathi(n-1) + 1 + solve(n-1 , x-(depth(n)+1)/2);
					}else{
						ans[n] = solve(n-1,x-1);
					}
				}	
			}
			return ans[n];
		}

		public static long depth(int n ) {
			long[] depth = new long[n+1];
			depth[0] = 1;
			for (int i = 1; i <= n; i++) {
				depth[i] = 2* depth[i-1] + 3;
			}
			return depth[n];
		}

		public static long pathi(int n) {
			long[] pathi = new long[n+1];
			pathi[0] = 1;
			for (int i = 1; i <= n; i++) {
				pathi[i] = pathi[i-1] * 2 + 1;
			}
			return pathi[n];
		}
}
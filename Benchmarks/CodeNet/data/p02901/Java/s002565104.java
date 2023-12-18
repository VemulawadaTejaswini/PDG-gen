
import java.util.Scanner;
import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static int inf = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [][]a = new int [m][2];
		
		
		for(int i = 0 ;i < m ;i++) {
			a[i][0] = Integer.parseInt(sc.next());
			int N = Integer.parseInt(sc.next());
			int num = 0;
			for(int j = 0 ; j < N ;j++) {
				int c = Integer.parseInt(sc.next());
				num += 1<<(c-1);
			}
			a[i][1] = num;
		}
		
		int []dp = new int [1<<n];
		for(int i = 0 ; i < 1<<n ;i++) {
			dp[i] = inf;
		}
		
		dp[0] = 0;
		
		for(int i = 0 ; i < m ;i++) {
			int p = a[i][1];
			for(int j = 0 ; j < 1<<n ;j++) {
				int q = j;
				for(int k = 0 ; k < n ;k++) {
					if(((p>>k)&1) == 1 && ((q>>k)& 1) == 0) {
						 q += 1<<k;
					}
				}
				dp[q] = Math.min(dp[q], dp[j] + a[i][0]);
			}
		}
		if(dp[(1<<n)-1] == inf) {
			System.out.println(-1);
			return;
		}
		System.out.println(dp[(1<<n)-1]);
		
		}
		
	}


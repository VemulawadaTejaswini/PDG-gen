import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static int MOD = 1000000007;
	
	public static int fact(int n) {
	      int fact = 1;
	      int i = 1;
	      while(i <= n) {
	         fact *= i;
	         fact %= MOD;
	         i++;
	      }
	      return fact%MOD;
	   }
	
	public static int comb(int n, int k) {
		return fact(n) / (fact(k) * fact(n-k));
	}
	
	public static void main(String[] args) {
		int MOD = 1000000007;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=0; i<n; i++) {
			list.add(in.nextLong());
		}
		Collections.sort(list);
		long max_sum = 0;
		long min_sum = 0;
		for (int i=0; i<=n-k; i++) {
			min_sum += list.get(i)*comb(n-i-1,k-1) % MOD;
			max_sum += list.get(n-i-1)*comb(n-i-1,k-1) % MOD;
		}
		
		System.out.println((max_sum-min_sum+MOD)%MOD);
	}
}

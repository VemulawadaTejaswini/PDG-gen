import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long mod = 998244353;
		long[] depthCnt = new long[N+1]; 
		int max = 0;
		long ans = 1;
		long s = input.nextLong();
		if (s==0) {
			for (int i = 1; i < N; i++) {
				long x = input.nextLong();
				ans*=x;
				ans%=mod;
			}
		}else ans = 0;
		System.out.println(ans);
	}	
}
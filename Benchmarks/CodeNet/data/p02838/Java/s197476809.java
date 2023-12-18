
import java.util.Random;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		long mod = (long)Math.pow(10, 9) + 7;
		
		long[] A = new long[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}
		
		long count = 0;
		
		for(int i = 0; i < 62; i++) {
			long zeros = 0;
			long ones = 0;
			for(int j = 0; j < N; j++) {
				long b = (long)A[j] & (long)1;
				if(b == 0) {
					zeros++;
				} else {
					ones++;
				}
				A[j] >>= 1;
			}
			
			long c = (((zeros * ones) % mod) * ((long)1 << i)) % mod;
			count += c % mod;
			count %= mod;
			
		}
		
		System.out.println(count);
 
	}
 
}
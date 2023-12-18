import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] T = new long[N];
		
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
		}
		
		if(N == 1) {
			System.out.println(T[0]);
		} else {
			long yaku = gcd(T[0], T[1]);
			long min = T[0] * T[1] / yaku;
			for(int i = 1; i < N - 1; i++) { 
				yaku = gcd(min, T[i + 1]);
				min = kou(min, T[i + 1], yaku);
			}
			System.out.println(min);
		}
	}
	
	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);		
	}
	
	public static long kou(long a, long b, long c) {
		return a /c * b;
	}
}

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		
		long lcm = (C * D) / gcd(D, C);
		long b = B - (B/C) - (B/D) + (B/lcm);
		long a = (A-1) - ((A-1)/C) - ((A-1)/D) + ((A-1)/lcm);
		
		System.out.println(b-a);
	}		
	
	 private static long gcd(long a, long b) {
		    if (b == 0) {
		      return a;
		    }
		    return gcd(b, a%b);
		  }
}

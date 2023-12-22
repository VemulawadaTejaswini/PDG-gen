import java.math.BigInteger;
import java.util.*;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		while(sc.hasNextInt()) {
			n = sc.nextInt();
			int[][] pair = new int[n][2];
			for(int i = 0; i < n; i++) {
				pair[i][0] = sc.nextInt();
				pair[i][1] = sc.nextInt();
			}
			
			BigInteger lcm1 = new BigInteger("1");
			for(int i= 0; i < n; i++) 
				lcm1 = lcm(lcm1, new BigInteger(Integer.toString(pair[i][1])));
			
			
			BigInteger[] t = new BigInteger[n];
			BigInteger lcm2 = new BigInteger("1");
			for(int i = 0; i < n; i++) {
				t[i] = new BigInteger(Integer.toString(pair[i][0])).multiply(lcm1).divide(new BigInteger(Integer.toString(pair[i][1])));
				lcm2 = lcm(lcm2, t[i]);
			}

			for(int i = 0; i < n; i++) 
				System.out.println(lcm2.divide(t[i]));
		}
	}
	
	static BigInteger lcm(BigInteger x, BigInteger y) {
		if(x.compareTo(y) >= 1) {
			BigInteger tmp = y;
			y = x;
			x = tmp;
		}
		
		return (x.multiply(y)).divide(x.gcd(y));
	}
}
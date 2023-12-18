import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long sum = 0;
		int[] s = new int[n];
		for( int i=1 ; i<n ; i++ ) {
			s[sc.nextInt()-1]++;
		}
		
		for( int i=0 ; i<n ; i++ ) {
			System.out.println(s[i]);
		}
		
	}
		
	static int gcd(int... array) {
		int gcd = 0;
		for(int i = 0; i < array.length; i ++) { gcd = gcd(gcd, array[i]); }
		return gcd;
	}
	
	static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

}

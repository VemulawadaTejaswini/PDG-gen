import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long sum = 0;
		for( int i=1 ; i<= n ; i++ )
			for( int j=1 ; j<= n ; j++ )
				for( int k=1 ; k<= n ; k++ ) 
					sum+=gcd(i,j,k);
		
		System.out.println(sum);
		
	}
		
	static int gcd(int... array) {
		int gcd = 0;
		for(int i = 0; i < array.length; i ++) { gcd = gcd(gcd, array[i]); }
		return gcd;
	}
	
	static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

}
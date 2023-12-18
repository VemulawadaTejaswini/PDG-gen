import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		try (Scanner scan = new Scanner(System.in)) {
 
			long x = scan.nextLong();
			long y = scan.nextLong();
 
			if(y > x) {
				long swap = x;
				x = y;
				y = swap;
			}
			
			Long s = 2L;
			long gcd = gcd(x, y);
       
			int ans = 1;
			while (s <= Math.sqrt(gcd)) {
				if ( gcd % s == 0 ) ans++;
				
				while ( gcd % s == 0 ) gcd /= s;
					s++;
				
			}
			if ( gcd != 1 ) ans++;
			System.out.println(ans);
		}
	}
  
  	private static long gcd(long x, long y) {
  		if(y == 0) return x;
     	return gcd(y, x%y);     
    }
}
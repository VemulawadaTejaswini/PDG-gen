import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static void main(String[] args) {
 
		try (Scanner scan = new Scanner(System.in)) {
 
			Long x = scan.nextLong();
			Long y = scan.nextLong();
 
			if(y > x) {
				Long swap = x;
				x = y;
				y = swap;
			}
			
			int s = 2;
			Long gcd = gcd(x, y);
       
			Set<Long> xSet = new HashSet<>();
			xSet.add(1L);
			
			int ans = 1;
			while (s*s <= gcd) {
				if ( gcd % s == 0 ) ans++;
				
				while ( gcd % s == 0 ) gcd /= s;
					s++;
				
			}
			System.out.println(ans);
		}
	}
  
  	private static Long gcd(Long x, Long y) {
  		if(y == 0) return x;
     	return gcd(y, x%y);     
    }
}
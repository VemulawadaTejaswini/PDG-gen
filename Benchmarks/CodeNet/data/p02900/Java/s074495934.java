import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static void main(String[] args) {
 
		try (Scanner scan = new Scanner(System.in)) {
 
			Long x = scan.nextLong();
			Long y = scan.nextLong();
 
			if(x > y) {
				Long swap = x;
				x = y;
				y = swap;
			}
			
			Long s = 2L;
			Long gcd = gcd(y, x);
       
			Set<Long> xSet = new HashSet<>();
			xSet.add(1L);
			Long xNum = gcd;
			while (s <= gcd) {
				if(xNum % s == 0) {
					xNum /= s;
					xSet.add(s);
				} else {
					s++;
				}
			}
			System.out.println(xSet.size());
		}
	}
  
  	private static Long gcd(Long x, Long y) {
     if(x%y == 0) return y;
     	return gcd(y, x%y);     
    }
}
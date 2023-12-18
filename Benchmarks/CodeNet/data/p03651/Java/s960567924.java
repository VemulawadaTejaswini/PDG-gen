import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			int num = a[i];
			max = Math.max(num, max);
			
		}
		int gcd = a[0];
		for(int i = 1; i < n; i++) {
			gcd = gcd(a[i],gcd);
		}
		if(k<=max&&(max-k)%gcd==0) System.out.println("POSSIBLE");
		else System.out.println("IMPOSSIBLE");
	}
	static int gcd(int m, int n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }
}
import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = gcd(a[0],a[1]);
		for(int i = 2; i < n; i++) {
			ans = gcd(ans,a[i]);
		}
		System.out.println(ans);
	 }
	 private static int gcd(int m, int n) {
		 if(m<n) return gcd(n,m);
		 if(n==0)return m;
		 return gcd(n,m%n);
	 }
}
import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	 public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   long A = sc.nextLong();
	   long B = sc.nextLong();
	   long ans = 1;
	   long N = gcd(A,B);
	   long now = N;
	   for(int i = 2; i <= Math.sqrt(N); i++) {
		   if(now%i != 0) {
			   continue;
		   }
		   ans++;
		   while(now%i==0) {
			   now/=i;
		   }
	   }
	   if(now != 1) {
			 ans++;
		 }
	  System.out.println(ans);
	 }
	  private static long gcd(long m, long n) {
		  if(m < n) return gcd(n, m);
		  if(n == 0) return m;
		  return gcd(n, m % n);
	  }
	}
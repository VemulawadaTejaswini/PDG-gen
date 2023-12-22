Copy
Copy
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      
      long setGCD = 0;
      for(int i= 0; i<n; i++){
        arr[i] = sc.nextLong();
        
        setGCD = gcd(setGCD, arr[i]);
      }
      long prod = 1;
      long[] prodArr = new long[n];
      for(int i=n-1; i>=0; i--){
        prod *= arr[i];
        prodArr[i] = prod;
      }
      boolean pairWise = true;
      boolean setWise = true;
      for(int i=0; i<n-1; i++){
        long cur = arr[i];
        //long next = arr[i+1];
        long nextProd = prodArr[i+1];
        if(gcd(cur, nextProd) != 1) pairWise = false;
      }
      setGCD = gcd(setGCD, arr[n-1]);
      if(pairWise) System.out.println("pairwise coprime");
      else if(setGCD == 1) System.out.println("setwise coprime");
      else System.out.println("not coprime");
	}
  public static long gcd(long a, long b){
    if(b==0) return a;
    return gcd(b, a%b);
  }
}
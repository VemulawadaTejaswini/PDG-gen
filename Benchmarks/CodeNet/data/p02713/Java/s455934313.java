
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int res = 0 ;
		for(int i = 1 ; i <= k ; i++) {
			for(int j = 1 ; j<= k ; j++ ) {
				for(int t= 1 ; t <= k ; t++) {
					 res += gcd(gcd(i, j), t);
				}
			}
		}
		System.out.println(res);
	}

	 public static int gcd(int a, int b) 
     { 
         if (a == 0) 
             return b; 

         return gcd(b%a, a); 
     } 
}

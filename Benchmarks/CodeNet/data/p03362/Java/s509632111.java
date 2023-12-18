import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = 0;
		int number = 11;
		StringBuilder sb = new StringBuilder();
		while (idx < n) {
		    if (isPrime(number)) {
		        if (idx != 0) {
		            sb.append(" ");
		        }
		        sb.append(number);
		        idx++;
		    }
		    number += 10;
		}
	    System.out.println(sb);
   }
   
   static boolean isPrime(int x) {
       for (int i = 2; i <= Math.sqrt(x); i++) {
           if (x % i == 0) {
               return false;
           }
       }
       return true;
   }
}



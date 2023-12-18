import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int K=gi();
         long N=0;
         while(K>0) {
        	 N=f(N);
        	 K--;
         }
    	 
         System.out.println(N);
     }
     
  // s進数で表した時の文字列
 	public static long f(long n) {
 		if(n<10) return n+1;
 		
 		long one=n%10;
 		long ten=(n/10)%10;
 		if((one==ten && one!=9) || ten-1==one) return n+1;
 		
 		long ret=f(n/10);
 		long a=ret%10;
 		ret=ret*10+a;
        if(a!=0)ret--;
 		return ret;

 	}

     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}
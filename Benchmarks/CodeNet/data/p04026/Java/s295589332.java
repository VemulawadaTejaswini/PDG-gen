

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String S=gs();
         for (int i=0; i<S.length()-1;i++) {
        	 if(S.charAt(i)==S.charAt(i+1)) {
        		 System.out.println((i+1)+" "+(i+2));
        		 return;
        	 }
         }
         for (int i=0; i<S.length()-2;i++) {
        	 if(S.charAt(i)==S.charAt(i+2)) {
        		 System.out.println((i+1)+" "+(i+3));
        		 return;
        	 }
         }
         
         System.out.println("-1 -1");
     }

  // a^nをmodで割ったあまり
 	public static long modpow(long a, long n, long mod) {
 		long res=1;
 		while(n>0) {
 			if((n & 1) == 1) res=res*a%mod;
 			a=a*a%mod;
 			n=n>>1;
 		}

 		return res;
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
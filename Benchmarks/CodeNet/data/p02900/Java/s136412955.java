

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long A=gl();
         long B=gl();

         long c=0;
         if (A<B) {
        	 for (long i=1; i<=Math.sqrt(A); i++) {
        		 if(A%i==0) {
        			 long i2=A/i;
        			 if(B%i==0) {
                         if(isP(i) || i==1) c++;
        			 }

        			 if(B%i2==0 && i2!=i) {
                         if(isP(i2) || i2==1) c++;
        			 }
        		 }
        	 }
         } else {
        	 for (long i=1; i<=Math.sqrt(B); i++) {
        		 if(B%i==0) {
        			 long i2=B/i;
        			 if(A%i==0) {
                         if(isP(i) || i==1) c++;
        			 }

        			 if(A%i2==0 && i2!=i) {
                         if(isP(i2) || i2==1) c++;
        			 }
        		 }
        	 }
         }

         System.out.println(c);
     }

  // 素数判定
 	public static boolean isP(long n) {
 		if(n==1) return false;
 		for (int i=2; i<=Math.sqrt(n);i++) {
 			if(n%i==0) {
 				return false;
 			}
 		}

 		return true;
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

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long X=gl();

         long A=0;
         long B=0;
         while(true) {
        	 long A5=(long)Math.pow(A, 5);
        	 if(A5>=0) {
        		 long B5=A5-X;
        		 double div=1d/5d;
        		 double d=Math.pow(Math.abs(B5), div);
        		 B=B5>=0 ? Math.round(d) : -Math.round(d);
        		 if(A5-Math.pow(B, 5)==X) {
        		     break;
        	     }
        		 A5=-A5;
        		 B5=A5-X;
        		 d=Math.pow(Math.abs(B5), div);
        		 B=B5>=0 ? Math.round(d) : -Math.round(d);
        		 if(A5-Math.pow(B, 5)==X) {
        			 A=-A;
        		     break;
        	     }
        	 } else {
        		 break;
        	 }
        	 A++;
         }


         System.out.println(A + " " + B);
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
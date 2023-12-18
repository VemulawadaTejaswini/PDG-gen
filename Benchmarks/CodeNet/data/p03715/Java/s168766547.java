
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long H=gl();
         long W=gl();

         long ans=0;
         if(H%3!=0 && W%3!=0) {
        	 ans=Integer.MAX_VALUE;
        	 if (W>H) {
        		 for(long i=1; i<W;i++) {
        			 long o=H*i;
        			 long t;
        			 if(H%2==0) {
        				 t=(W-i)*H/2;
        				 long s=Math.abs(o-t);
        				 ans=Math.min(ans, s);
        			 } else {
        				 t=(W-i)*(H-1)/2;
        				 long t2=(W-i)*(H+1)/2;
        				 long ma=Math.max(o, t2);
        				 long mi=Math.min(o, t);
        				 ans=Math.min(ans, ma-mi);
        			 }
        		 }
        	 } else {
        		 for(long i=1; i<H;i++) {
        			 long o=W*i;
        			 long t;
        			 if(W%2==0) {
        				 t=(H-i)*W/2;
        				 long s=Math.abs(o-t);
        				 ans=Math.min(ans, s);
        			 } else {
        				 t=(H-i)*(W-1)/2;
        				 long t2=(H-i)*(W+1)/2;
        				 long ma=Math.max(o, t2);
        				 long mi=Math.min(o, t);
        				 ans=Math.min(ans, ma-mi);
        			 }
        		 }
        	 }
         }
         System.out.println(ans);
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
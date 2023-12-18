
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         double a=gd();
         double b=gd();
         double x=gd();

         double d=0;;
         if(a*a*b/2<x) {
        	 d=Math.atan((2*a*a*b-2*x)/(a*a*a));
         } else {
        	 d=Math.atan(a*b*b/(2*x));
         }

         System.out.println(d*180/Math.PI);
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
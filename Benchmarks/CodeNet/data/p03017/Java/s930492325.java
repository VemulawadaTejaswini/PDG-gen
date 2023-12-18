
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int a=gi()-1;
         int b=gi()-1;
         int c=gi()-1;
         int d=gi()-1;
         String s=gs();

         boolean bs=false;
         String acs= s.substring(a,c+1);
         String bds= s.substring(b,d+1);
         if (acs.contains("##") || bds.contains("##")) {
        	 System.out.println("No");
        	 return;
         }

         if (c<d) {
        	 System.out.println("Yes");
        	 return;
         }

         String bds2= s.substring(b-1,d+2);

         if (bds2.contains("...")) {
        	 System.out.println("Yes");
        	 return;
         } else {
        	 System.out.println("No");
         }

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
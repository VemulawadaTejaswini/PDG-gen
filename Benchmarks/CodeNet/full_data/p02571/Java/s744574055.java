
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String s=gs();
         String t=gs();
         int ans = Integer.MAX_VALUE;
         for (int i=0; i<s.length()+1 - t.length();i++) {
        	 String sub=s.substring(i, i+t.length());
        	 int tmp=0;
        	 for (int j=0;j<t.length();j++) {
        		 char c=sub.charAt(j);
        		 char d=t.charAt(j);
        		 if(c!=d)tmp++;
        	 }
        	 ans=Math.min(tmp, ans);
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
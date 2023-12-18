
import java.util.Arrays;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String s=gs();
         int min=Integer.MAX_VALUE;
         String abc="abcdefghijklmnopqrstuvwxyz";
         
         for(int i=0; i<26;i++) {
        	 String c=abc.substring(i,i+1);
        	 if(s.contains(c)) {
        		 int max=0;
        		 int tmp=0;
        		 for (int j=0; j<s.length();j++) {
        			 String cj=s.substring(j,j+1);
        			 if(c.equals(cj)) {
        				 max=Math.max(tmp, max);
        				 tmp=0;
        			 } else {
        				 tmp++;
        			 }
        		 }
        		 max=Math.max(tmp, max);
        		 min=Math.min(min, max);
        	 }
         }

         System.out.println(min);
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
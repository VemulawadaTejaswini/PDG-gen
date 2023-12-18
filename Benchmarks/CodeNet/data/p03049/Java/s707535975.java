
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         String[] s=new String[N];

         long ans=0;
         long ac=0;
         long bc=0;
         long abc=0;

         for (int i=0;i<N;i++) {
        	 s[i]=gs();
        	 ans+=s[i].split("AB").length-1;
        	 if(s[i].charAt(0)=='B' && s[i].charAt(s[i].length()-1)=='A') {
        		 abc++;
        	 } else if(s[i].charAt(s[i].length()-1)=='A') {
        		 ac++;
        	 } else if(s[i].charAt(0)=='B') {
        		 bc++;
        	 }
         }
         
         if(abc>0) {
        	 ans+=abc-1;
        	 if(ac>0) {
        		 ac--;
        		 ans++;
        	 }
        	 if(bc>0) {
        		 bc--;
        		 ans++;
        	 }
         }
         ans+=Math.min(ac, bc);
         
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
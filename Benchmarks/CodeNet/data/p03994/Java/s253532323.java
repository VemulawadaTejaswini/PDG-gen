
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String s=gs();
         int K=gi();
         StringBuilder sb=new StringBuilder();
         String a="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
         for (int i=0; i<s.length()-1;i++) {
             char c=s.charAt(i);
             int kk=f(c);
             if(kk<=K) {
            	 K-=kk;
            	 sb.append('a');
             } else {
            	 sb.append(c);
             }
         }

         char lc=s.charAt(s.length()-1);
         K=K%26;
         lc=a.charAt(a.indexOf(lc)+K);
         sb.append(lc);

         System.out.println(sb);
     }

     public static int f(char c) {
    	 int r=c-97;
    	 return (26-r)%26;
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
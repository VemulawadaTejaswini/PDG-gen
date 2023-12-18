
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         String s1=gs();
         String s2=gs();

         boolean tf=false;
         boolean btf=false;
         boolean sf=true;
         long ans=1;
         for (int i=0; i<N;i++) {
             char c1=s1.charAt(i);
             char c2=s2.charAt(i);
             if(c1==c2) {
                 tf=true;
             } else {
            	 tf=false;
            	 i++;
             }
             if(sf) {
            	 sf=false;
            	 if(tf) {
            		 ans=3;
            	 } else {
            		 ans=6;
            	 }
            	 btf=tf;
             } else {
            	 if(tf) {
            		 if (btf) {
            		     ans=(ans * 2)%1000000007;
            		 }
            	 } else {
            		 if(btf) {
            			 ans=(ans*2)%1000000007;
            		 } else {
            			 ans=(ans*3)%1000000007;
            		 }
            	 }
            	 btf=tf;
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

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int H=gi();
         int W=gi();
         int N=gi();

         int[] ans=new int[H*W];

         int ind=0;
         boolean f=true;
         for (int i=1; i<=N;i++) {
        	 int a=gi();
        	 for (int j=0; j<a;j++) {
        	     ans[ind]=i;
        	     if(f) {
        		     ind++;
        		     if(ind%W==0) {
        			     ind+=W-1;
        			     f=false;
        		     }
        	     } else {
        		     ind--;
        		     if(ind%W==W-1) {
        			     ind+=W+1;
        			     f=true;
        		     }
        	     }
        	 }
         }

         for (int i=0; i<H;i++) {
        	 for (int j=0; j<W;j++) {
                 int k=i*W+j;
                 if(j!=0)System.out.print(" ");
                 System.out.print(ans[k]);
             }
        	 System.out.println();
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
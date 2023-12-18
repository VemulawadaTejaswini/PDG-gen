
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] A=new long[N];

         long ans=0;
         int f=0;
         int t=0;
         int o=0;
         for (int i=0; i<N;i++) {
        	 A[i]=gi();
        	 if(A[i]%4==0) {
        		 f++;
        	 } else if(A[i]%2==0) {
        		 t++;
        	 } else {
        		 o++;
        	 }
         }
         if(t>0)o++;
         if((f!=0 && f+1>=o) || (t==N)) {
        	 System.out.println("Yes");
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
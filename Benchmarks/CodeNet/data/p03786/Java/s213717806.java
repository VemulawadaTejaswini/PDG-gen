
import java.util.Arrays;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         long[] b=new long[N];

         for (int i=0; i<N;i++) {
        	 a[i]=gi();
         }
         Arrays.parallelSort(a);
         b[0]=a[0];
         for (int i=1; i<N;i++) {
        	 b[i]=b[i-1]+a[i];
         }

         int ans=1;
         for (int i=N-1; i>0;i--) {
        	 if (a[i]>b[i-1]*2) {
        		 break;
        	 } else {
        		 ans++;
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
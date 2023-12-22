
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         long[] b=new long[N];

         long sum =0;
         for (int i=0; i<N;i++) {
             a[i]=gl();
             sum+=a[i];
         }
         b[0]=sum-a[0];
         for (int i=1; i<N-1;i++) {
             b[i]=b[i-1]-a[i];
         }

         long ans=0;
         for (int i=0; i<N-1;i++) {
             ans+=a[i]*b[i];
             ans=ans%1000000007;
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
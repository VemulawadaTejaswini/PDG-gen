
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int K=gi();
         long[] sum=new long[N+2];

         for(long i=1; i<N+2;i++) {
        	 sum[(int)i]=i*(i-1)/2;
         }

         long ans=0;
         for (int i=K; i<N+2;i++) {
             long a=sum[i];
             long b=sum[N+1]-sum[N-i+1];
             ans=(ans+b-a+1)%1000000007;
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
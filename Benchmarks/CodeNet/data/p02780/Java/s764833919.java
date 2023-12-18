

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int K=gi();
         long[] a=new long[N];
         long sum=0;
         for(int i=0; i<N;i++) {
        	 a[i]=gl();
        	 if(i<K)sum+=a[i];
         }
         long max=sum;
         int mi=K-1;
         for(int i=K; i<N;i++) {
        	 sum+=a[i];
        	 sum-=a[i-K];
        	 if(max<sum) {
        	     max=sum;
        	     mi=i;
        	 }
         }

         double ans=0;
         for(int i=mi-K+1; i<=mi;i++) {
        	 double q=a[i]+1;
        	 ans+=q/2;
         }



         System.out.println(ans);
     }

     public static long f(long n) {
    	 if(n==1)return 1;
    	 return 2*f(n>>1);
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
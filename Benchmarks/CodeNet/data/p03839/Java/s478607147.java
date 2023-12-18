
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int K=gi();
         long[] a=new long[N];

         long ps=0;
         for (int i=0; i<N;i++) {
        	 a[i]=gi();
        	 if(a[i]>=0)ps+=a[i];
         }

         int max=0;
         int c=1;
         for (int i=1; i<N;i++) {
        	 if (a[i]>=0 && a[i-1]>=0 || a[i]<0 && a[i-1]<0) {
        		 c++;
        	 } else {
        		 max=Math.max(max, c);
        		 c=1;
        	 }
         }
         max=Math.max(max, c);

         long ans=0;
         if (max>=K) {
        	 ans=ps;
         } else {
        	 long sm =0;
        	 for (int i=0; i<K;i++) {
            	 sm+=a[i];
             }
        	 long smin=sm;
        	 long ts=sm;
        	 int si=0;
        	 int ei=K-1;
        	 int minsi=0;
        	 int minei=K-1;
        	 for (int i=K; i<N;i++) {
            	 ts-=a[i-K];
            	 ts+=a[i];
            	 if (sm<ts) {
            	     sm=ts;
            	     si=i-K+1;
            	     ei=i;
            	 } else {
            		 smin=ts;
            		 minsi=i-K+1;
            		 minei=i;
            	 }
             }

        	 if (sm>=K) {
        		 for (int i=0; i<N;i++) {
                	 if(a[i]>0 || (si<=i && i<=ei)) {
                		 ans+=a[i];
                	 }
                 }
        	 } else {
        		 for (int i=0; i<N;i++) {
                	 if(a[i]>0 && (minsi>i || i>minei)) {
                		 ans+=a[i];
                	 }
                 }
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
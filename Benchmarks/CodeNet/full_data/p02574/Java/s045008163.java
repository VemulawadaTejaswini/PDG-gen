
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         boolean[] f=new boolean[1000001];
         for (int i=0; i<N;i++) {
        	 a[i]=gl();
         }
         Arrays.parallelSort(a);

         String ans="not coprime";
         long gcd=uclid(a[0], a[1]);
         for (int i=2; i<N;i++) {
        	 if(gcd==1) break;
        	 gcd=uclid(gcd, a[i]);
         }
         if(gcd==1) {
        	 ans="setwise coprime ";
         } else {
        	 System.out.println(ans);
        	 return;
         }

         for (int i=0; i<N;i++) {
        	 List<Long> l=yaku(a[i]);
        	 for (int j=0; j<l.size();j++) {
        		 long v=l.get(j);
        		 if(f[(int)v] && v!=1) {
        			 System.out.println(ans);
        			 return;
        		 } else {
        			 f[(int)v]=true;
        		 }
        	 }
         }


         System.out.println("pairwise coprime");

     }

  // 素因数分解
     public static List<Long> yaku(long n) {
         List<Long> l=new ArrayList<Long>();
         for(long i=1; i*i<=n;i++) {
        	 if(n%i==0) {
        		 l.add(i);
        		 if(i!=n/i) l.add(n/i);
        	 }
         }
          return l;
      }

     // ユークリッドの互除法
     public static long uclid(long m, long n) {
         if (m<n) {
             m^=n;
             n^=m;
             m^=n;
         }

         while(true) {
             long t=m%n;
             if (t==0) {
                 return n;
             } else {
                 m=n;
                 n=t;
             }
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
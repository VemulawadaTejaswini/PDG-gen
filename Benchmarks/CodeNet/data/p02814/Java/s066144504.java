
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long M=gl();
         long[] a=new long[N];

         boolean flg=true;
         for (int i=0;i<N;i++) {
        	 a[i]=gi()/2;
         }
         int b=dt(a[0]);
         for (int i=1;i<N;i++) {
        	 if(dt(a[i])!=b) {
        		 flg=false;
        		 break;
        	 }
         }

         long ans=0;
         if(flg) {
        	 long kb=1;
             for (int i=0; i<N;i++) {
                 kb=kb*a[i] / uclid(kb,a[i]);
             }
             long tmp=Math.floorDiv(M, kb);
             if(tmp%2==0) {
            	 ans=tmp/2l;
             } else {
            	 ans=(tmp+1l)/2l;
             }
         }


         System.out.println(ans);
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

     public static int dt(long n) {
    	 if(n==0)return 0;
    	 int ret=0;
    	 while((n&1)==0) {
    		 n=n>>1;
             ret++;
    	 }
    	 return ret;
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
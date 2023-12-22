
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long N=gl();
         String x=gs();

         long popc=0;
         for (int i=0; i<N;i++) {
        	 char c=x.charAt(i);
        	 if(c=='1') popc++;
         }

         long mpc =popc-1;
         long ppc=popc+1;
         long mpcx=0;
         long ppcx=0;

         if (mpc>0) {
        	 for (int i=0; i<N;i++) {
        		 char c=x.charAt(i);
            	 if(c=='1') {
            		 mpcx+=modpow(2,N-i-1, mpc);
            		 mpcx%=mpc;
            	 }
        	 }
         }

         for (int i=0; i<N;i++) {
    		 char c=x.charAt(i);
        	 if(c=='1') {
        		 ppcx+=modpow(2,N-i-1, ppc);
        		 ppcx%=ppc;
        	 }
    	 }

         for (int i=0;i<N;i++) {
        	 char c=x.charAt(i);
        	 if(c=='0') {
        		 long sx=ppcx+modpow(2, N-i-1, ppc);
    			 sx%=ppc;
    			 System.out.println(1+f(sx));
        	 } else {
        		 if(mpc==0) {
        			 System.out.println(0);
        		 } else {
        			 long sx=mpcx-modpow(2, N-i-1, mpc);
        			 sx=(sx+mpc)%mpc;
        			 System.out.println(1+f(sx));
        		 }
        	 }
         }

         //System.out.println(ans);
     }

     public static long f(long x) {
    	 long ret=0;
    	 while(x>0) {
    		 ret++;
    		 x=x%popx(x);
    	 }
    	 return ret;
     }

     public static long popx(long n) {
    	 long ret=0;
    	 while(n>0) {
    		 if(n%2==1)ret++;
    		 n=n>>1;
    	 }

    	 return ret;
     }

     // a^nをmodで割ったあまり
     public static long modpow(long a, long n, long mod) {
         long res=1;
         while(n>0) {
             if((n & 1) == 1) res=res*a%mod;
             a=a*a%mod;
             n=n>>1;
         }

         return res;
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
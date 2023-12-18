

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long x=gl();
         long[] A=new long[N];

         long ans=0;
         for (int i=0; i<N;i++) {
        	 A[i]=gi();
         }

         int[] make=new int[N];
         long[] range=new long[N];
         long mr=0;
         for (int i=0; i<N;i++) {
        	 long min = Long.MAX_VALUE;
        	 for (int j=0; j<N;j++) {
        		 long v=A[j]+f(N, j+1, i+1)*x;
            	 if(min>v){
            		 min=v;
            		 make[i]=j;
            		 range[i]=f(N,j+1,i+1);
            	 }
             }
        	 mr=Math.max(mr, range[i]);
        	 ans+=A[make[i]];
         }
         ans+=mr*x;

         System.out.println(ans);

     }

     public static long f(int n, int s, int e) {
    	 if(s<=e) {
    		 return e-s;
    	 } else {
    		 return n-s+e;
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
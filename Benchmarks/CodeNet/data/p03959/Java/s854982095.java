
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] t=new long[N];
         long[] a=new long[N];
         long[] d=new long[N];
         long[] hn=new long[N];

         for(int i=0; i<N;i++) {
        	 t[i]=gl();
         }
         for(int i=0; i<N;i++) {
        	 a[i]=gl();
         }

         d[0]=t[0];
         hn[0]=1;
         for(int i=1; i<N;i++) {
        	 if(t[i]!=t[i-1]) {
        		 d[i]=t[i];
        		 hn[i]=1;
        	 } else {
        		 hn[i]=t[i];
        	 }
         }
         if(d[N-1]!=0 && d[N-1]!=a[N-1]) {
        	 hn[N-1]=0;
         } else {
        	 d[N-1]=a[N-1];
        	 hn[N-1]=1;
         }
         for(int i=N-2; i>=0;i--) {
        	 if(a[i]!=a[i+1]) {
        		 if(d[i]==0) {
        			 d[i]=a[i];
        			 hn[i]=1;
        		 } else {
        			 if(d[i]>a[i]) {
        				 hn[i]=0;
        			 } else {
        			     hn[i]=Math.min(hn[i], a[i]);
        			 }
        		 }
        	 } else {
        		 hn[i]=Math.min(hn[i], a[i]);
        	 }
         }

         long ans=1;
         for(int i=0; i<N;i++) {
        	 ans*=hn[i];
        	 ans=ans%1000000007;
         }
         System.out.println(ans);
     }

     public static int f(char c) {
    	 int r=c-97;
    	 return (26-r)%26;
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
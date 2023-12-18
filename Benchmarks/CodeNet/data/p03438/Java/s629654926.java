

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] a=new long[N];
         long[] b=new long[N];

         long as=0;
         long bs=0;
         for (int i=0; i<N;i++) {
        	 a[i]=gl();
        	 as+=a[i];
         }
         for (int i=0; i<N;i++) {
        	 b[i]=gl();
        	 bs+=b[i];
         }

         int ai=0;
         int bi=0;
         for (int i=0; i<N;i++) {
        	 if(a[i]<b[i]) {
        		 if((a[i]-b[i])%2==0) {
        			 ai+=(b[i]-a[i])/2;
        		 } else {
        			 ai+=(b[i]-a[i]+1)/2;
        			 bi+=1;
        		 }
        	 } else if(b[i]<a[i]) {
        		 bi+=a[i]-b[i];
        	 }
         }

         if(bs-as>=0) {
        	 long t=bs-as;
        	 if(ai>=bi) {
        		 if(t==ai+(ai-bi)) {
        			 System.out.println("Yes");
        		 } else {
        			 System.out.println("No");
        		 }
        	 } else {
        			 System.out.println("No");

        	 }
         } else {
             System.out.println("No");
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
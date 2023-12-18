
import java.util.Arrays;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] a=new int[N];

         for(int i=0; i<N;i++) {
        	 a[i]=gi();
          }

         Arrays.parallelSort(a);

         if(N%3==0) {
        	 int a1=a[0];
        	 int a2=a[N/3];
        	 int a3=a[N*2/3];
        	 int[] as= {a1,a2,a3};
        	 int t=a1^a2^a3;
        	 if(t!=0) {
    		     System.out.println("No");
    		     return;
    	     }
             for(int i=0; i<3;i++) {
            	 for(int j=i*N/3; j<(i+1)*N/3;j++) {
            	     if(as[i]!=a[j]) {
            		     System.out.println("No");
            		     return;
            	     }
                  }
              }
         } else {
        	 for(int i=0; i<N;i++) {
        	     if(a[i]!=0) {
        		     System.out.println("No");
        		     return;
        	     }
              }
         }

         System.out.println("Yes");
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
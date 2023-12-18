
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

         int n=a[N-1];
         int r=a[0];

         for (int i=0; i<N-1;i++) {
        	 int t=Math.min(a[i], n-a[i]);
        	 int rt=Math.min(r, n-r);
        	 if(t>rt) {
        		 r=a[i];
        	 }
         }

         System.out.println(n+" "+r);
         //System.out.println(ans);
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
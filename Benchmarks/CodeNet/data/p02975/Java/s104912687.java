
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

         for(int i=0; i<N;i++) {
        	 int i2=(i+1)%N;
        	 int i3=(i+2)%N;
        	 int t=a[i];
        	 t=a[i]^a[i2]^a[i3];
        	 if(t!=0) {
        		 System.out.println("No");
        		 return;
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
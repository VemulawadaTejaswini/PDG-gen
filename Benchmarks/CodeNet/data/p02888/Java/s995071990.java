
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] L=new long[N];
         for(int i=0; i<N; i++) {
        	 L[i]=gl();
         }

         Arrays.parallelSort(L);

         Stack<Long> l=new Stack<Long>();
         for (int i=1; i<N; i++) {
        	 for(int j=0; j<i; j++) {
        		 l.add(L[i]+L[j]);
        	 }
         }
         Collections.sort(l);
         long c=0;
         for (int i=N-1; i>=2; i--) {
        	 for(int j=0; j<i; j++) {
        		 l.pop();
        	 }

        	 int li=-1;
        	 int ri=l.size();
        	 while(ri-li>1) {
        		 int ind=(li+ri)/2;
        		 if(L[i]<l.get(ind)) {
        			 ri=ind;
        		 } else {
        			 li=ind;
        		 }
        	 }
        	 c+=l.size()-li-1;
         }

         System.out.println(c);
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
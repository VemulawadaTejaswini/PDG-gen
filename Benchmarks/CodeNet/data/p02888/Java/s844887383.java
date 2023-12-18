
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

         List<Long> l=new ArrayList<Long>();
         for (int i=0; i<N; i++) {
        	 for(int j=i+1; j<N; j++) {
        		 l.add(L[i]+L[j]);
        	 }
         }
         Collections.sort(l);
         long c=0;
         for (int i=N-1; i>=2; i--) {
        	 for(int j=0; j<i; j++) {
        		 l.remove(L[i]+L[j]);
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

  // 素数判定
 	public static boolean isP(long n) {
 		if(n==1) return false;
 		for (int i=2; i<=Math.sqrt(n);i++) {
 			if(n%i==0) {
 				return false;
 			}
 		}

 		return true;
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
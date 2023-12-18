import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] A=new int[N];
         int[] B=new int[N];

         long sa=0;
         long sb=0;
         for (int i=0; i<N;i++) {
        	 A[i]=gi();
        	 sa+=A[i];
         }
         for (int i=0; i<N;i++) {
        	 B[i]=gi();
        	 sb+=B[i];
         }
         boolean f=true;
         if (sb<sa) f=false;

         long ca=0;
         long cb=0;
         for (int i=0; i<N;i++) {
        	 int a=A[i];
        	 int b=B[i];
        	 if (a>=b) {
        		 cb+=a-b;
        	 } else {
        		 if((b-a)%2==0) {
        			 ca+=(b-a)/2;
        		 } else {
        			 ca+=Math.floorDiv(b-a, 2)+1;
        			 cb++;
        		 }
        	 }
         }
         if (ca>cb) {
        	 sa+=2*ca;
        	 sb+=ca;
        	 if(sb<sa) f=false;
         } else {
        	 sa+=2*cb;
        	 sb+=cb;
        	 if(sb<sa) f=false;
         }
         if(f==true) {
             System.out.println("Yes");
         } else {
        	 System.out.println("No");
         }
     }

  // 素因数分解
 	public static List<Integer> insuB(int n) {
 		List<Integer> l=new ArrayList<Integer>();
 		int i=2;
 		while(i*i<=n) {
 			if (n%i==0) {
 				l.add(i);
 				n/=i;
 			} else {
 				i++;
 			}
 		}
 		if(n!=1)l.add(n);
 		return l;
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
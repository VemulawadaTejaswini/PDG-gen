import java.io.IOException;
import java.util.Scanner;

class Main {
	static final int INF = 1000000001;

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

      Scanner sc = new Scanner(System.in);

	   int n = Integer.parseInt( sc.next()  );

	   int[] A = new int[n];
	   int[] B = new int[n];
	   int K = Integer.MIN_VALUE;
	   for(int i = 0;i < n; i++){
		   A[i] = Integer.parseInt(sc.next());
		   K = Math.max(K, A[i]);
	   }

	   CountingSort( A, B, K, n);


	   for(int i = 0;i < n; i++){
		   System.out.print(B[i]);
		   if(i < n-1 ){
			   System.out.print(" ");
		   }
	   }

	   System.out.println();
	   sc.close();
   }






   public static void CountingSort(int[] A, int[] B, int k , int n){

	   int[] C = new int[k+1];
       for(int i = 0; i <= k; i++){
        	C[i] = 0;
       }

       for (int i = 0; i < A.length; i++)
           C[A[i]]++;

       for (int i = 1; i <= k; i++)
           C[i] += C[i - 1];

       for (int i = A.length - 1; i >= 0; i--) {
           C[A[i]]--;
           B[C[A[i]]] = A[i];

       }


   }
}
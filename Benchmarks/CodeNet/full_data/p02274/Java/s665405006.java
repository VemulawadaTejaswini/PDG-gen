import java.io.IOException;
import java.util.Scanner;

class Main {
	static final int INF = 1000000001;

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

      Scanner sc = new Scanner(System.in);

	   int n = Integer.parseInt( sc.next()  );

	   int[] A = new int[n];

	   for(int i = 0;i < n; i++){

		   A[i] = Integer.parseInt(sc.next());
	   }

	    bubleSort(A, 0, n);


	   //System.out.println();
	   System.out.println(changecount);
	   sc.close();
   }



   public static void buble( int[] A, int left, int mid ,int right){

	   int n1 = mid - left;
	   int n2 = right - mid;
       int[] L = new int[n1+1];
       int[] R = new int[n2+1];


	   for(int i = 0; i < n1;i++ ){
		   L[i] = A[left + i];

	   }

	   for(int i = 0; i < n2;i++ ){
		   R[i] = A[mid + i];

	   }

	   L[n1] =  INF;
	   R[n2] =  INF;

	   int i = 0;
	   int j = 0;

	   for(int k = left; k < right; k++ ){

		   if(L[i] <= R[j]){
			   A[k] = L[i];
			      i = i + 1;
			      changecount+=j;
		   }else{
			   A[k] = R[j];
			      j = j + 1;

		   }

	   }


   }


   public static void bubleSort(int[] A, int left, int right){


	   if(left+1 < right){
		    int mid = (left + right)/2;
		    bubleSort(A, left, mid);
		    bubleSort(A, mid, right);
		   buble(A, left, mid, right);

	   }



   }
}
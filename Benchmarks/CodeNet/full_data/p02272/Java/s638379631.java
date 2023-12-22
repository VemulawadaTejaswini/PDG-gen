import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	static final int INF = 1000000001;

	static int changecount;
   public static void main(String args[]) throws IOException{


	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt( br.readLine()  );
	  // String[] string =  br.readLine().split(" ");
	   int[] A = new int[n];
	   Scanner sc = new Scanner(System.in);
	   for(int i = 0;i < n; i++){
        // A[i] = Integer.parseInt( string[i] ) ;
		   A[i] = Integer.parseInt(sc.next());
	   }

	    mergeSort(A, 0, n);

	   for(int i = 0;i < n; i++){
		   System.out.print(A[i]);
		   if(i < n-1 ){
			   System.out.print(" ");
		   }
	   }
	   System.out.println();
	   System.out.println(changecount);
   }



   public static void merge( int[] A, int left, int mid ,int right){

	   int n1 = mid - left;
	   int n2 = right - mid;
       int[] L = new int[n1+1];
       int[] R = new int[n2+1];

       //System.out.println("  n1="+ n1+" n2="+n2);
	   for(int i = 0; i < n1;i++ ){
		   L[i] = A[left + i];
		   //System.out.println(" n1="+n1+" n2="+n2);
		   //System.out.println("  L[i]="+ L[i]);
	   }

	   for(int i = 0; i < n2;i++ ){
		   R[i] = A[mid + i];
		   //System.out.println("  R[i]="+ R[i]);
	   }

	   L[n1] =  INF;
	   R[n2] =  INF;

	   int i = 0;
	   int j = 0;

	   for(int k = left; k < right; k++ ){

		   if(L[i] <= R[j]){
			   A[k] = L[i];
			      i = i + 1;
			      changecount++;
		   }else{
			   A[k] = R[j];
			      j = j + 1;
			      changecount++;
		   }

	   }
	   //System.out.println(changecount);


   }


   public static void mergeSort(int[] A, int left, int right){
	   //System.out.println(" left="+left+" right="+right);

	   if(left+1 < right){
		    int mid = (left + right)/2;
		    mergeSort(A, left, mid);
		    mergeSort(A, mid, right);
		   merge(A, left, mid, right);
		    //System.out.println(changecount);
	   }



   }
}
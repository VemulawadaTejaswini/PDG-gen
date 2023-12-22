
import java.util.Scanner;

public class Main{
	static int MAX = 500000;
    static int[] A = new int[MAX];
    static int[] L = new int[MAX/2 + 1];
    static int[] R = new int[MAX/2 + 1];
    static int count;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
       
        for (int i=0; i<N; i++){
        	A[i]=sc.nextInt();
        }
        sc.close();
        
      
        Main.MergeSort(A, 0, N);
        
        for (int i=0; i<N; i++){
        	System.out.print(A[i]);
            if(i < N - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(count);
  
	}

	
	public static void Merge(int []A, int left, int mid, int right){
	  int n1 = mid - left;
	  int n2 = right - mid;
	  
	  L[n1] = 1000000001;
	  R[n2] = 1000000001;
	  
	  for (int i = 0; i<n1; i++){
		  L[i] = A[left + i];
	  }
	
	  for (int i = 0; i<n2; i++){
		  R[i] = A[mid + i];
	  }
	  
	  int i = 0, j = 0;
	  for (int k = left;  k < right; k++){
		  count++;
		  if (L[i] <= R[j]){
			  A[k] = L[i];
			  i++;
		  }
		  else {
			  A[k] = R[j];
			  j++;
		  }
	  }
	}


	public static void MergeSort(int [] A, int left, int right){
	  if (left+1 < right){
		  int mid = (left + right)/2;
		  MergeSort(A, left, mid);
	      MergeSort(A, mid, right);
	      Merge(A, left, mid, right);
	  }
	        
	}
}


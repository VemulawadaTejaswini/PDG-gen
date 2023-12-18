

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

import java.util.Scanner;

public class Main{
	static int MAX = 1000000;
    static int[] A = new int[MAX];
    static int[] L = new int[MAX/2 + 1];
    static int[] R = new int[MAX/2 + 1];
    static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    int X [] = new int [M];

	    for (int i=0;i<M;i++) {
	    	X[i]=sc.nextInt();
	    }
	    
	    sc.close(); 
	    Main.MergeSort(X, 0, M);
	    
	    Deque <Integer> D = new ArrayDeque<Integer>(); 

	    for (int i=0;i<M-1;i++) {
	    	D.push(X[i+1]-X[i]);
	    	//System.out.println(D.peek());
	    }
	    
	    int size = Math.min(N-1, D.size());
	    for (int i=0;i<size;i++) {
	    	D.remove(Collections.max(D));
	    }
	    
	    int new_size = D.size();
	    int sum = 0;
	    
	    for (int i=0;i<new_size;i++) {
	    	sum+=D.poll();
	    }
	    System.out.println(sum);
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



import java.util.Scanner;

public class Main{
//public static swap(){}
	public static void maxHeapify(int[] A, int i){
		  int H = A.length;
		  int largest;
	      int l = 2*(i+1)-1;
	      int r = 2*(i+1);	      
	      // select the node which has the maximum value
	      if (l < H && A[l] > A[i])
	          largest = l;
	      else 
	          largest = i;
	      if (r < H && A[r] > A[largest])
	          largest = r;
	
	      if (largest != i)// value of children is larger than that of i
	      {
	    	  int temp = A[i];
	    	  A[i] = A[largest];
	    	  A[largest] = temp;
	    	  maxHeapify(A, largest); // call recursively
	      }	      
}

	public static void main(String[] argv) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] tree = new int[n];
		for(int i = 0; i < n; i ++) {
			tree[i] = in.nextInt();
//			System.out.println(tree[i]);
		}
		for(int i = (n-1)/2; i >= 0; i--) {
			maxHeapify(tree, i);
		}
		for(int i = 0; i < n; i ++) {
			System.out.print(" " + tree[i]);
		}
		System.out.println();
		in.close();
	}
}


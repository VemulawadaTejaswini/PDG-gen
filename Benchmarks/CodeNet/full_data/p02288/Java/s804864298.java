import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	
	public static void main(String[] args){
		int[] A = new int[n+1];
		for(int i=1; i<n+1; i++){
			A[i] = sc.nextInt();
		}
		
		buildMaxHeap(A);
		
		for(int i=1; i<n+1; i++){
			System.out.print(" " + A[i]);
		}
		System.out.println();
	}
	
	static void maxHeapify(int[] A, int i){
		int l = 2*i;
		int r = 2*i+1;
		int lar=0;
		int tmp=0;
		if (l <= n && A[l] > A[i]){
			lar = l;
		} else {
			lar = i;
		}
		if (r <= n && A[r] > A[lar]){
			lar = r;
		}
		
		if (lar != i){
			tmp = A[lar];
			A[lar] = A[i];
			A[i] = tmp;
			maxHeapify(A, lar);
		}
	}
	
	static void buildMaxHeap(int[] A){
		for (int i=n/2; i>0; i--){
			maxHeapify(A, i);
		}
	}
}


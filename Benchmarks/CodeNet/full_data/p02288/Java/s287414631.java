import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		for(int i=n/2-1;i>=0;i--){
			heapify(nums,n,i);
		}
		printArr(nums);
//		for(int i=n-1;i>=0;i--){
//			swap(nums,i,0);
//			heapify(nums,i,0);
//		}
//		printArr(nums)
	}
	public static void heapify(int[] A,int n,int i){
		int largest = i; 
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<n && A[l]>A[largest]){
			largest = l; 
		}
		if(r<n && A[r]>A[largest]){
			largest = r; 
		}
		if(largest!=i){
			swap(A,i,largest);
			heapify(A,n,largest);
		}
	}
	public static void swap(int[] A,int i,int j){
		int t = A[i];
		A[i] = A[j];
		A[j] = t; 
	}
	public static void printArr(int[] A){
		for(int i=0;i<A.length;i++){
			if(i!=0) System.out.print(" "+A[i]);
			else System.out.print(A[i]);
		}
		System.out.println();
	}
}
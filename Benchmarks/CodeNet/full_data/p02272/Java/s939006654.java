import java.util.Scanner;

public class Main {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		
		mergeSort(A, n, 0, n);
		
		for(int i=0; i<n; i++){
			System.out.println(A[i]);
		}
		
	}
	public static void merge(int[] A, int n, int left, int mid, int right){
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[500000/2+2];
		int[] R = new int[500000/2+2];
		for(int i=0; i<n1; i++){
			L[i] = A[left+i];
		}
		for(int i=0; i<n2; i++){
			R[i] = A[mid + i];
		}
		L[n1] = 2000000000;
		R[n2] = 2000000000;
		int i = 0;
		int j = 0;
		for(int k=left; k<right; k++){
			if(L[i] <= R[j]){
				A[k] = L[i];
				i = i + 1;
			}else {
				A[k] = R[j];
				j = j + 1;
			}
		}
	}
	
	public static void mergeSort(int[] A, int n,int left, int right){
		if (left+1 < right){
			int mid = (left + right)/2;
			mergeSort(A, n,left, mid);
			mergeSort(A, n, mid, right);
			merge(A, n, left, mid, right);
		}
	}

}

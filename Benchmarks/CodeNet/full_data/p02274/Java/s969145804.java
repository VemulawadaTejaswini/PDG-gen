import java.util.*;

class Main{
	static int c=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		mergeSort(A, 0, n);
		System.out.println(c);
	}
	static void mergeSort(int A[], int left, int right){
		if(left+1 < right){
			int mid = (left + right)/2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}
	static void merge(int A[], int left, int mid, int right){
		int n1 = mid - left;
		int n2 = right - mid;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		for(int i=0; i<n1; i++){
			L[i] = A[left + i];
		}
		for(int i=0; i<n2; i++){
			R[i] = A[mid + i];
		}
		L[n1] = R[n2] = Integer.MAX_VALUE;
		int i, j;
		i = j = 0;
		for(int k=left; k<right; k++){
			if(L[i] <= R[j]){
				A[k] = L[i++];
			} else{
				A[k] = R[j++];
				c += (n1 - i);
			}
		}
	}
}
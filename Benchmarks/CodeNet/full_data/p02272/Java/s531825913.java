import java.util.*;

public class Main{

	static int merge(int[] A, int left, int mid, int right){
		int cnt = 0;
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i = 0; i < n1; i++) L[i] = A[left + i];
		for(int i = 0; i < n2; i++) R[i] = A[mid + i];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++){
			cnt++;
			if(L[i] < R[j]){
				A[k] = L[i];
				i++;
			}else{
				A[k] = R[j];
				j++;
			}
		}
		return cnt;
	}

	static int mergeSort(int[] A, int left, int right){
		int cnt = 0;
		if(left+1 < right){
			int mid = (left + right) / 2;
			cnt += mergeSort(A, left, mid);
			cnt += mergeSort(A, mid, right);
			cnt += merge(A, left, mid, right);
		}
		return cnt;
	}

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in).useDelimiter("[\\s]+");
		int cnt = 0;
		int n = scan.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		cnt = mergeSort(S, 0, n);
		for(int i = 0; i < n; i++)
			System.out.printf(i != n-1? "%d " : "%d\n", S[i]);
		System.out.printf("%d\n", cnt);
	}
}
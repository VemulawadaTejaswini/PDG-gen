import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		ALDS1_5_B();
	}
	//Merge Sort
	public static void ALDS1_5_B() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++)
			A[i] = sc.nextInt();

		class MG{
			int cnt = 0;
			void MergeSort(int n, int A[], int left, int right) {
				if(left + 1 < right) {
					int mid = (left + right) / 2;
					MergeSort(n, A, left, mid);
					MergeSort(n, A, mid, right);
					Merge(n, A, left, mid, right);
				}
			}

			void Merge(int n, int[] A, int left, int mid, int right) {
				int[] L = new int[mid - left + 1];
				int[] R = new int[right - mid + 1];
				for(int i = 0; i < (mid - left); i++) {
					L[i] = A[(left + i)];
				}
				for(int i = 0; i < (right - mid); i++) {
					R[i] = A[(mid + i)];
				}
				L[mid - left] = Integer.MAX_VALUE;
				R[right - mid] = Integer.MAX_VALUE;
				int i = 0, j = 0;
				for(int k = left; k < right; k++) {
					cnt++;
					if(L[i] > R[j]) {
						A[k] = R[j++];
					}else {
						A[k] = L[i++];
					}
				}
			}
		}
		
		MG mg = new MG();
		mg.MergeSort(n, A, 0, n);
		for(int i = 0; i < n; i++) {
			if(i != 0)
				System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(mg.cnt);
	}
}

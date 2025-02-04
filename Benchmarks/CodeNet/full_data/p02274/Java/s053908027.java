/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_D&lang=jp
 */
import java.util.*;


public class Main {

	int[] A;
	int count = 0;

	void merge(int left, int mid, int right) {
		//System.out.println("#: " + left + ", " + mid + ", " + right);
		//printArray(A);
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for (int i = 0; i < n1; i++) L[i] = A[left + i];
		for (int i = 0; i < n2; i++) R[i] = A[mid + i];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				count++;
				A[k] = R[j];
				j++;
			}
		}
		//printArray(A);
		//System.out.println();
	}

	void mergeSort(int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(mid, right);
			mergeSort(left, mid);
			merge(left, mid, right);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		mergeSort(0, A.length);
		System.out.println(count-1);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}


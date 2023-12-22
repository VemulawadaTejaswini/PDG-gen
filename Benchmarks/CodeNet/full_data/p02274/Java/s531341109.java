import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner in;
	static PrintWriter out;
	static int n;
	static int[] A,L,R;
	
	static {
		in = new Scanner(new BufferedInputStream(System.in));
		out = new PrintWriter(new BufferedOutputStream(System.out));
	}
	
	static long merge(int[] A, int n, int left, int mid, int right) {
		/*for(int i = 0; i < n; i++) {
			out.print(A[i] + " ");
		}
		out.flush();
		out.println();*/
		int n1 = mid - left;
		int n2 = right - mid;
		L = new int[n1 + 2];
		R = new int[n2 + 2];
		for(int i = 0; i < n1; i++) L[i] = A[left + i];
		for(int i = 0; i < n2; i++) R[i] = A[mid + i];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		long cnt = 0;
		for(int k = left; k < right; k++) {
			if(L[i] <= R[j]) {
				A[k] = L[i++];
			}else {
				A[k] = R[j++];
				cnt += n1 - i;
			}
		}
		return cnt;
	}
	
	static long mergeSort(int[] A, int n, int left, int right) {
		if(left < right - 1) {
			int mid = (left + right) / 2;
			long a = mergeSort(A, n, left, mid);
			long b = mergeSort(A, n, mid, right);
			long c = merge(A, n, left, mid, right);
			return a + b + c;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		n = in.nextInt();
		A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		long ans = mergeSort(A, n, 0, n);
		/*for(int i = 0; i < n; i++) {
			out.print(A[i] + " ");
		}
		out.flush();
		out.println();*/
		out.println(ans);
		out.flush();
		out.close();
		in.close();
	}
}

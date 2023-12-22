import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int MAX = 500000;
	public static int SENTINEL = 2000000000;
	public static int[]L = new int[MAX / 2 + 2];
	public static int[]R = new int[MAX / 2 + 2];
	public static int cnt;

	public static void main(String[] args) throws IOException {
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//scan.close();
		int []A = new int[n];
//		for(int i = 0; i < n; i++) {
//			A[i] = scan.nextInt();
//		}

		String s = br.readLine();
		String[] num = s.split(" ");
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(num[i]);
		}
		br.close();
		cnt = 0;
		mergeSort(A, n, 0, n);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n - 1; i++) {
			sb.append(A[i]);
			sb.append(" ");
			//System.out.print(A[i] + " ");
		}
		System.out.print(sb.toString());
		System.out.println(A[n - 1]);
		System.out.println(cnt);
	}

	public static void merge(int A[], int n, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		for(int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for(int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}
		L[n1] = SENTINEL;
		R[n2] = SENTINEL;
		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++) {
			cnt ++;
			if(L[i] <= R[j]) {
				A[k] = L[i ++];
			}else {
				A[k] = R[j ++];
			}
		}
	}
	public static void mergeSort(int A[], int n, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, n, left, mid);
			mergeSort(A, n, mid, right);
			merge(A, n, left, mid, right);
		}
	}
}

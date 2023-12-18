import java.util.*;

// ARC 84-A
// https://beta.atcoder.jp/contests/arc084/tasks/arc084_a

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		TreeSet<Integer> aSet = new TreeSet<Integer>();
		TreeSet<Integer> cSet = new TreeSet<Integer>();
		
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
			aSet.add(A[i]);
		}
		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			C[i] = in.nextInt();
			cSet.add(C[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		
		long answer = 0;
		for (int i = 0; i < N; i++) {
			Integer a = aSet.lower(B[i]);
			Integer c = cSet.higher(B[i]);
			
			
			if (a != null && c != null) {
				long aIndex = binarySearch1(A, a);
				long cIndex = binarySearch2(C, c);
				
				answer += (aIndex + 1) * (N - cIndex);
			}
		}
		System.out.println(answer);
	}
	
	public static int binarySearch1(int[] arr, int n) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == n && (mid == arr.length - 1 || arr[mid + 1] != arr[mid])) {
				return mid;
			} else if (arr[mid] > n) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static int binarySearch2(int[] arr, int n) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == n && (mid == 0 || (mid > 0 && arr[mid - 1] != arr[mid]))) {
				return mid;
			} else if (arr[mid] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
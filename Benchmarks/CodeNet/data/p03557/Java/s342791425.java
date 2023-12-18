import java.util.*;

public class Main {
	static int N;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int temp_b = BinarySearch(A[i], B, 0, N / 2, N, 0);
			if(A[i] > B[temp_b]) continue;
			for(int j = temp_b; j < N; j++) {
				int temp_c = BinarySearch(B[j], C, 0, N / 2, N, 0);
				if(B[j] > C[temp_c]) continue;
				ans += N - temp_c;
			}
		}
		System.out.println(ans);
	}
	
	static int BinarySearch(int num, int ary[], int low, int mid, int hight, int cnt) {
		cnt++;
		if(ary[mid] <= num && cnt >= 100) {
			if(mid == N - 1) return mid;
			return mid + 1;
		} else if(ary[mid] > num && cnt >= 100) {
			return mid;
		}
		if(num >= ary[(hight + mid) / 2]) {
			return BinarySearch(num, ary, mid, (hight + mid) / 2, hight, cnt);
		} else {
			return BinarySearch(num, ary, low, mid / 2, mid, cnt);
		}
	}
}

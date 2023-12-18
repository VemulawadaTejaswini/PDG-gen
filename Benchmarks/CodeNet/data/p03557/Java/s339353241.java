import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Integer[] A = new Integer[N];
		Integer[] B = new Integer[N];
		Integer[] C = new Integer[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		for(int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}

		for(int i=0; i<N; i++) {
			C[i] = sc.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		long ans = 0;
		for(int i=0; i<N; i++) {
			int key = B[i];
			int a_n = binary_search(A, key, 0, A.length);
			if(a_n <= 0 || a_n > A.length)
				continue;

			key++;
			int c_n = binary_search(C, key, 0, C.length);
			if(c_n < 0 || c_n >= C.length)
				continue;

			ans += (long)a_n * (N-c_n);
		}

		System.out.println(ans);

	}

	//okの条件（ここを問題ごとに変える）(int)
	public static boolean isOK(Integer[] a, int index, int key) {
		if(a[index] >= key)
			return true;
		else
			return false;
	}

	//okの条件（ここを問題ごとに変える）(long)
	public static boolean isOK(Long[] a, int index, long key) {
		if(a[index].longValue() >= key)
			return true;
		else
			return false;
	}

	//めぐる式二分探索(デフォルトはkey以上を満たす最小のindexを返す)(int)
	public static int binary_search(Integer[] a, int key, int ng, int ok) {
//		int ng = -1;
//		int ok = a.length;
		if(ng < ok)
			ng--;
		else
			ok--;

		while(Math.abs(ok-ng) > 1) {
			int mid = (ok+ng) / 2;

			if(isOK(a, mid, key))
				ok = mid;
			else
				ng = mid;
		}

		return ok;
	}

	//めぐる式二分探索(デフォルトはkey以上を満たす最小のindexを返す)(long)
	public static int binary_search(Long[] a, long key, int ng, int ok) {
//		int ng = -1;
//		int ok = a.length;
		if(ng < ok)
			ng--;
		else
			ok--;

		while(Math.abs(ok-ng) > 1) {
			int mid = (ok+ng) / 2;

			if(isOK(a, mid, key))
				ok = mid;
			else
				ng = mid;
		}

		return ok;
	}

	//keyが含まれているか(int)
	public static boolean containsValue(Integer[] a, int key) {
		int index = binary_search(a, key, 0, a.length);

		if(index < 0 || index >= a.length || a[index] != key)
			return false;
		else
			return true;
	}

	//keyが含まれている個数(int)
	public static int countValue(Integer[] a, int key) {
		int index1 = binary_search(a, key, 0, a.length);
		int index2 = binary_search(a, key+1, 0, a.length);

		if(index1 < 0 || index1 >= a.length || a[index1] != key)
			return 0;

		return index2 - index1;
	}

	//keyが含まれているか(long)
	public static boolean containsValue(Long[] a, long key) {
		int index = binary_search(a, key, 0, a.length);

		if(index < 0 || index >= a.length || a[index] != key)
			return false;
		else
			return true;
	}

	//keyが含まれている個数(long)
	public static int countValue(Long[] a, long key) {
		int index1 = binary_search(a, key, 0, a.length);
		int index2 = binary_search(a, key+1, 0, a.length);

		if(index1 < 0 || index1 >= a.length || a[index1] != key)
			return 0;

		return index2 - index1;
	}

}

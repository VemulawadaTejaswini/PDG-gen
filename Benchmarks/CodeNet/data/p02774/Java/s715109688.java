import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int K = scanner.nextInt();
		long[] A = new long[N];

		int nega = 0;
		int posi = 0;

		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
			if (A[i] < 0)
				nega++;
			else if (A[i] > 0)
				posi++;
		}
		Arrays.parallelSort(A);

		System.out.println(A[0]+"*"+A[N-1]+"="+A[0]*A[N-1]);

		if (K <= nega * posi) {
			long inf = A[0] * A[N - 1]-1;
			long max = A[nega - 1] * A[N - posi];

			long mid;
			int value;
			while (max - inf > 1) {
				mid = (inf + max) / 2;
				value = countLeq(A, mid, N, nega, posi);
				if (value < K) {
					inf = mid;
				} else {
					max = mid;
				}
			}

			System.out.println(max);
			return;
		} else if (comb(N) - K + 1 <= comb(nega) + comb(posi)) {
			int L = comb(N) - K + 1;//上からL番目
			long min;
			long sup = A[0] * A[1] > A[N - 2] * A[N - 1] ? A[0] * A[1]+1 : A[N - 2] * A[N - 1]+1;

			if(posi<2) {
				min=A[nega-2]*A[nega-1];
			}else if(nega<2) {
				min=A[N-posi]*A[N-posi+1];
			}else {
				min=A[nega-2]*A[nega-1] < A[N-posi]*A[N-posi+1] ? A[nega-2]*A[nega-1] : A[N-posi]*A[N-posi+1];
			}


			long mid;
			int value;
			while (sup - min > 1) {
				mid = (min + sup) / 2;
				value = countGeq(A, mid, N, nega, posi);

				if (value < L) {
					sup = mid;
				} else {
					min = mid;
				}
			}
			System.out.println(min);
			return;
		} else {
			System.out.println(0);
			return;
		}

	}

	static int countLeq(long[] a, long mid, int size, int nega, int posi) {
		int count = 0;

		int left = 0;
		int right = size - posi;
		while (left < nega) {
			if (a[left] * a[right] > mid)
				if (right == size - 1)
					break;
				else
					right++;
			else {
				count += size - right;
				left++;
			}
		}
		return count;
	}

	static int countGeq(long[] a, long mid, int size, int nega, int posi) {
		int count = 0;

		int left = 0;
		int right = nega - 1;
		while (left < right) {
			if (a[left] * a[right] < mid) {
				right--;
			} else {
				count += right - left;
				left++;
			}
		}

		left = size - posi;
		right = size - 1;
		while (left < right) {
			if (a[left] * a[right] < mid) {
				left++;
			} else {
				count += right - left;
				right--;
			}
		}
		return count;
	}

	static int comb(int n) {
		return (int) ((long) n * (n - 1) / 2);
	}

}

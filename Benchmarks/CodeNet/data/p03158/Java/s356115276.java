

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int Q = Integer.parseInt(scan.next());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(scan.next());
		}
		int[] X = new int[Q];
		for (int i = 0; i < Q; i++) {
			X[i] = Integer.parseInt(scan.next());
		}
		int[] copiedA = new int[N];
		for(int i=0;i<Q;i++) {
			System.arraycopy(A, 0, copiedA,0, A.length);
			System.out.println(countNumForTakahashi(copiedA, X[i]));
		}
	}

	private static int countNumForTakahashi(int[] A, int X) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=getMax(A);
			i++;
			getNearX(A,X);
		}
		return sum;
	}

	private static int getMax(int[] A) {
		int max = -1;
		int maxIndex = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != -1 && A[i] > max) {
				max = A[i];
				maxIndex = i;
			}
		}
		if (maxIndex != -1) {
			A[maxIndex] = -1;
		}
		return max;
	}

	private static int getNearX(int[] A, int X) {
		int diffMin = -1;
		int i = 0;
		for (i = 0; i < A.length; i++) {
			if (A[i] == -1) {
				continue;
			} else {
				diffMin = Math.abs(A[i] - X);
				break;
			}
		}
		int result = -1;
		int resultIndex = -1;
		int diff;
		for (int j = i + 1; j < A.length; j++) {
			if (A[j] == -1) {
				continue;
			}
			diff = Math.abs(A[j] - X);
			if (diff == diffMin) {
				if (A[j] < result) {
					result = A[j];
					resultIndex = j;
				}
			} else if (diff < diffMin) {
				diffMin = diff;
				result = A[j];
				resultIndex = j;
			}
		}
		if (resultIndex != -1) {
			A[resultIndex] = -1;
		}
		return result;
	}
}

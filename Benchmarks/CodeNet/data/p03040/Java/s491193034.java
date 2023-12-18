import java.util.*;
import java.util.function.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static void printSolve(int[] A, long sumB, int cntA) {
		if (cntA == 0) {
			System.out.println("0 0");
			return;
		}
		if (cntA == 1) {
			System.out.println(A[0] + " " + sumB);
			return;
		}
		int pos = cntA / 2;
		int value = A[pos];
		if (cntA % 2 == 0) {
			int cntL = 0;
			for (int i = pos - 1; i >= 0; i--) {
				if (A[pos] == A[i]) {
					cntL++;
				} else {
					break;
				}
			}
			int cntR = 0;
			int pos2 = pos + 1;
			for (int i = pos2 + 1; i < cntA; i++) {
				if (A[pos2] == A[i]) {
					cntR++;
				} else {
					break;
				}
			}
			if (cntL < cntR) {
				pos = pos2;
				value = A[pos2];
			}
		}
		long sum = sumB;
		for (int i = 0; i < cntA; i++) {
			sum += Math.abs(A[i] - value);
		}

		System.out.println(value + " " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int[] A = new int[Q];
		long sumB = 0;
		int cntA = 0;

		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			if (x == 1) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int pos = Arrays.binarySearch(A, 0, cntA, a);
				if (pos < 0) {
					pos = -pos - 1;
				}
				for (int j = cntA; j > pos; j--) {
					A[j] = A[j - 1];
				}
				A[pos] = a;
				cntA++;
				sumB += b;
				// System.err.println("input: " + x + ", " + a + ", " + b);
			} else {
				// System.err.println("input: " + x);
				printSolve(A, sumB, cntA);
			}
		}
	}
}

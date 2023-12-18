import java.io.*;
import java.util.*;

class Main {
	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			A[p]++;
			if (A[p] > 2) {
				System.out.println(0);
				return;
			}
		}
		if (N % 2 == 1) {
			if (A[0] != 1) {
				System.out.println(0);
				return;
			}
		} else if (A[0] != 0) {
			System.out.println(0);
			return;
		}

		for (int i = 1; i < A.length; i++) {
			if (A[i] == 1) {
				System.out.println(0);
				return;
			}
		}

		int a = 1;
		for (int i = 0; i < N / 2; i++) {
			a = a * 2 % M;
		}
		System.out.println(a);
	}
}

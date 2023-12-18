import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.nextLine();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		String[] a1An = sc.nextLine().split(" ");
		String[] b1Bn = sc.nextLine().split(" ");
		String[] c1Cn = sc.nextLine().split(" ");

		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(a1An[i]);
			B[i] = Integer.parseInt(b1Bn[i]);
			C[i] = Integer.parseInt(c1Cn[i]);
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		long[] cntB = new long[N];
		int aIx = 0;

		for (int i = 0; i < N; i++) {
			int b = B[i];
			while (aIx < A.length && A[aIx] < b) {
				aIx++;
			}
			cntB[i] = aIx;
		}

		long[] cntC = new long[N];
		int bIx = 0;
		long total = 0;
		for (int i = 0; i < N; i++) {
			int c = C[i];
			long subTotal = (i == 0) ? 0 : cntC[i - 1];
			while (bIx < B.length && B[bIx] < c) {
				subTotal += cntB[bIx];
				bIx++;
			}
			cntC[i] = subTotal;
			total += subTotal;
		}

		System.out.println(total);
		sc.close();
	}

}
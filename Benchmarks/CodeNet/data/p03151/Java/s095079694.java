import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String line = s.nextLine();
		int N = Integer.parseInt(line);

		line = s.nextLine();
		String[] str = line.split(" ");
		long[] A = new long[N];
		long sumA = 0;
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(str[i]);
			sumA += A[i];
		}

		line = s.nextLine();
		str = line.split(" ");
		long[] B = new long[N];
		long sumB = 0;
		for (int i = 0; i < N; i++) {
			B[i] = Long.parseLong(str[i]);
			sumB += B[i];
		}

		if (sumB > sumA) {
			System.out.println(-1);
			return;
		}

		int changeCnt = 0;
		long penaSum = 0L;
		long[] pena = new long[N];
		long best = Long.MAX_VALUE;
		int bestId = -1;
		for (int i = 0; i < N; i++) {
			pena[i] = B[i] - A[i];
			if (pena[i] > 0) {
				changeCnt++;
				penaSum += pena[i];
			}
			if (best > pena[i]) {
				best = pena[i];
				bestId = i;
			}
		}

		while (penaSum > 0) {
			changeCnt++;
			penaSum += best;
			pena[bestId] = Long.MAX_VALUE;

			best = Long.MAX_VALUE;
			bestId = -1;
			for (int i = 0; i < N; i++) {
				if (best > pena[i]) {
					best = pena[i];
					bestId = i;
				}
			}
		}

		System.out.println(changeCnt);
	}
}
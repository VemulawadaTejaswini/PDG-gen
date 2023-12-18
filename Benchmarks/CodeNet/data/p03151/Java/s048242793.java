import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String line = s.nextLine();
		int N = Integer.parseInt(line);

		line = s.nextLine();
		String[] str = line.split(" ");
		int[] A = new int[N];
		int sumA = 0;
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(str[i]);
			sumA += A[i];
		}

		line = s.nextLine();
		str = line.split(" ");
		int[] B = new int[N];
		int sumB = 0;
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(str[i]);
			sumB += B[i];
		}

		if (sumB > sumA) {
			System.out.println(-1);
			return;
		}

		int changeCnt = 0;
		int penaSum = 0;
		int[] pena = new int[N];
		int best = Integer.MAX_VALUE;
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
			pena[bestId] = Integer.MAX_VALUE;

			best = Integer.MAX_VALUE;
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
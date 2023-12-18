
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int binary(int i, List<Integer> j) {

		int lower = 0;
		int upper = j.size() - 1;
		int pivot = -1;

		while (lower <= upper) {
			int mid = (lower + upper) / 2;

			if (i == j.get(mid)) {
				pivot = mid + 1;
				break;
			} else if (i < j.get(mid)) {

				if (mid == 0 || i > j.get(mid - 1)) {
					pivot = mid;
					break;
				}

				upper = mid - 1;
			} else {

				if (mid == upper) {
					pivot = -1;
					break;
				}

				if (i < j.get(mid + 1)) {
					pivot = mid + 1;
					break;
				}

				lower = mid + 1;
			}
		}

		return pivot;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		List<Integer> BtoC = new ArrayList<Integer>();
		List<Integer> AtoB = new ArrayList<Integer>();
		int ans = 0;
		int sizeB = 0;
		int sizeC = 0;
		int pivotB = -1;

		for (int j = 0; j < N; j++) {
			A.add(scan.nextInt());
		}

		Collections.sort(A);

		for (int j = 0; j < N; j++) {
			B.add(scan.nextInt());
		}

		Collections.sort(B);

		for (int j = 0; j < N; j++) {
			C.add(scan.nextInt());
		}

		Collections.sort(C);

		for (int i = 0; i < N; i++) {

			int pivotC = binary(B.get(i), C);

			if (pivotC == -1) {
				BtoC.add(i, 0);
				continue;
			}

			sizeC = N - pivotC;

			if (sizeC <= 0) {
				BtoC.add(i, 0);
				continue;
			}

			BtoC.add(i, sizeC);

			//System.out.println("Cno" + (N-binary(B.get(j), C)));
			//System.out.println("i=" + i);
			//System.out.println("j=" + j);
			//System.out.println("ans=" + ans);
		}

		//System.out.println("a");

		for (int i = 0; i < N; i++) {

			pivotB = binary(A.get(i), B);

			if (pivotB == -1) {
				AtoB.add(i, 0);
				continue;
			}

			sizeB = N - pivotB; // B size

			if (sizeB <= 0) {
				AtoB.add(i, 0);
				continue;
			}

			AtoB.add(i, sizeB);
			//System.out.println("AtoB.get(i):" + AtoB.get(i));

		}

		//System.out.println("b");

		for(int i = 0; i < N;i++) {

			//System.out.println("AtoB.get(i):" + AtoB.get(i));

			if(AtoB.get(i) == 0) {
				continue;
			}

			for(int j = N - AtoB.get(i); j<N; j++) {
				ans += BtoC.get(j);
			}

		}

		//System.out.println("c");

		/*
		for (int i = 0; i < sizeB; i++) {
			tmp.set(i, B.get(i + pivotB));
		}
		*/

		//System.out.println("A.get:" + A.get(i));
		//System.out.println("Bno" + sizeB);

		System.out.println(ans);

		scan.close();

	}
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String s = "";

		try {
			scanner = new Scanner(System.in);
			s = scanner.next();

			char[] wk = s.toCharArray();

			int cntA = 0;
			int cntB = 0;
			int cntC = 0;

			for (int i = 0; i < wk.length; i++) {
				char c = wk[i];
				if (c == 'a' && cntA == 0) {
					cntA++;
				} else if (c == 'b' && cntB == 0) {
					cntB++;
				} else if (c == 'c' && cntC == 0) {
					cntC++;
				}
			}

			System.out.println((cntA + cntB + cntC) == 3 ? "Yes" : "No");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numA = 0;
		int numB = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numK = scanner.nextInt();

			List<Integer> wk = new ArrayList<Integer>();
			for (int i = numA; i <= numB; i++) {
				if (i < numA + numK || numB - numK < i) {
					wk.add(i);
				}
			}

			for (int i = 0; i < wk.size(); i++) {
				System.out.println(wk.get(i));
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int[] wk = new int[3];
			wk[0] = scanner.nextInt();
			wk[1] = scanner.nextInt();
			wk[2] = scanner.nextInt();

			Arrays.sort(wk);

			/*
			 * 基準となる値の計算
			 * 全て最大値に合わせる前提
			 */
			int m3 = wk[2] * 3;
			/*
			 * 最大値に合わせてよいのか？
			 * 現在の総計と最大値に全てあわせた場合の偶奇が同じなら、
			 * 埋めなくてはいけない数値は偶数
			 * 違う場合は、埋めなくてはいけない数値が奇数
			 *  - 奇数に偶数を足しても奇数/偶数に偶数を足しても偶数
			 */
			boolean isEqual = (wk[0] + wk[1] + wk[2]) % 2 == m3 % 2;

			int targetNum = 0;
			int res = 0;
			/*
			 * 埋める数値が奇数の場合、そのままでは埋められないので
			 * 合わせる数値を+1する
			 */
			if (isEqual) {
				targetNum = wk[2];
			} else {
				targetNum = wk[2] + 1;
			}

			for (int i = 0; i < wk.length; i++) {
				res += (targetNum - wk[i]);
			}

			//			boolean isPlusOne = false;
			//			for (int i = 0; i < wk.length; i++) {
			//				res += (targetNum - wk[i]) / 2;
			//				if (!isPlusOne) {
			//					isPlusOne = (targetNum - wk[i]) % 2 != 0;
			//				}
			//			}
			//
			//			if (isPlusOne) {
			//				res++;
			//			}

			System.out.println(res / 2);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
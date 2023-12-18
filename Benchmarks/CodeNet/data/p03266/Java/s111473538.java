
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
//		new Main().solveC();
		new Main().solveC2();
		// new Main().solveD();
	}

	/**
	 * [K/2]（K/2の切捨て）は偶数の個数
	 */
	private void solveA() {
		Scanner scanner = null;
		int numK = 0;
		int eqaC = 0;
		int oddC = 0;

		try {
			scanner = new Scanner(System.in);
			numK = scanner.nextInt();
			for (int i = 1; i <= numK; i++) {
				if (i % 2 == 0) {
					eqaC++;
				} else {
					oddC++;
				}
			}

			System.out.println(eqaC * oddC);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;

		try {
			scanner = new Scanner(System.in);
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();

			int x3 = x2 - (y2 - y1);
			int y3 = y2 + (x2 - x1);
			int x4 = x3 - (y3 - y2);
			int y4 = y3 + (x3 - x2);

			System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int cntC(int a, int b, int c, int numN, int numK) {
		int cnt = 0;

		if (a > numN || b > numN || c > numN) {
			return 0;
		}
		if (wkMapForC.get(a + "-" + b + "-" + c) != null) {
			return 0;
		}

		if ((a + b) % numK == 0 && (b + c) % numK == 0 && (c + a) % numK == 0) {
			cnt++;
			//			System.out.println(a + "," + b + "," + c + " - " + cnt);
		}

		cnt += cntC(a + 1, b, c, numN, numK);
		cnt += cntC(a, b + 1, c, numN, numK);
		cnt += cntC(a, b, c + 1, numN, numK);

		wkMapForC.put(a + "-" + b + "-" + c, cnt);
		//		System.out.println(cnt);
		return cnt;
	}

	Map<String, Integer> wkMapForC = new HashMap<String, Integer>();

	/**
	 * C: Triangular Relationship
	K が奇数の時、a, b, c を K で割ったあまりはすべて 0 である必要があります。K が偶数の時、a, b, c を
	K で割ったあまりはすべて 0 であるか、あるいはすべて K/2 である必要があります。このような組の個数
	は、N 以下で K で割って 0 あまるものの個数と K/2 あまるものの個数から求めることができるので、この
	問題を解くことができました。

	 */
	/**
	 * K | a+b ← Kの倍数という表記
	 * K | b+c
	 * K | c+a
	 *
	 * 倍数同士は足しても引いても倍数を維持する。
	 * K | (a+b) + (b+c)  - (C+a) = 2b
	 * K | (a+b) - (b+c)  + (C+a) = 2a
	 * K | (C+a) + (b+c)  - (a+b) = 2c
	 *
	 * a+bがKの倍数になる条件
	 * a%K+b%K=0
	 * a%K+b%K=K => a%K = K/2
	 *
	 * Kが奇数の時は、
	 * K | a , K | b , K | c
	 * つまり、a(ｂ、ｃ)はKの倍数である。
	 * ※2倍したら必ず偶数になってしまう。そのため、Kが奇数の場合はk|2aではなく、K|aである必要がある
	 *
	 * Kが偶数の時は、
	 * K | 2a , K | 2b , K | 2c
	 * 　↓
	 * K/2 | a , K/2 | b , K/2 | c
	 *
	 * a= 0 or K/2 (mod K)
	 * b= 0 or K/2 (mod K)
	 * c= 0 or K/2 (mod K)
	 * つまり、a(|| ｂ || ｃ)はKの倍数であるまたは、K/2の倍数である。
	 */
	private void solveC2() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numK = scanner.nextInt();

			long cnt = 0;

			if (numK % 2 != 0) {
				//奇数
				long numCount = 0;
				for (int i = 1; i <= numN; i++) {
					if (i % numK == 0) {
						numCount++;
					}
				}
				cnt = (long) Math.pow(numCount, 3);
			} else {
				//偶数
				long numCount = 0;
				long numCount2 = 0;
				for (int i = 1; i <= numN; i++) {
					/*
					 * iがk/2の倍数かどうかの判定は
					 * i%K=k/2
					 * ↓
					 * i%k-k/2=0
					 */
					if (i % numK - numK / 2 == 0) {
						numCount++;
						//						System.out.println(i + " : 0");
					} else if (i % numK == 0) {
						numCount2++;
						//						System.out.println(i + " : 1");
					}
				}
				cnt = (long) Math.pow(numCount, 3) + (long) Math.pow(numCount2, 3);
			}

			/**
			 * TLE version
			 */
			//			for (int i = 1; i <= numN; i++) {
			//				for (int j = 1; j <= numN; j++) {
			//					if (i + j < numK || (i + j) % numK != 0) {
			//						continue;
			//					}
			//					for (int k = 1; k <= numN; k++) {
			//						if (j + k < numK || k + i < numK) {
			//							continue;
			//						}
			//						if ((j + k) % numK == 0 && (k + i) % numK == 0) {
			//							cnt++;
			//							System.out.println(i + "," + j + "," + k);
			//						}
			//					}
			//				}
			//			}
			System.out.println(cnt);
			//			System.out.println(cntC(1, 1, 1, numN, numK));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	/*
	 * greedy....
	 */
	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {

			int numN = scanner.nextInt();
			int numK = scanner.nextInt();

			Set<String> res = new HashSet<String>();
			for (int i = 1; i <= numN; i++) {
				int a = i;
				List<Integer> bL = new ArrayList<Integer>();
				List<Integer> cL = new ArrayList<Integer>();

				int sabun = a % numK == 0 ? numK : numK - a % numK;
				for (int j = sabun; j <= numN; j += numK) {
					bL.add(j);
					cL.add(j);
				}
				for (int j = 0; j < bL.size(); j++) {
					for (int k = 0; k < cL.size(); k++) {
						if ((bL.get(j) + cL.get(k)) % numK == 0) {
							res.add(a + ":" + bL.get(j) + ":" + cL.get(k));
						}
					}
				}
			}

			System.out.println(res.size());

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
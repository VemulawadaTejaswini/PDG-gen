import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int T, num[];
		int R[], G[], B[];// position of R,B,G
		int count1[], count2, /* counting number */ max, min;
		String str[];
		num = new int[9];
		str = new String[9];
		R = new int[9];
		B = new int[9];
		G = new int[9];
		count1 = new int[10];
		int i, j, k, m, n, l;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (i = 0; i < T * 2; ++i) {
			k = 0;
			m = 0;
			n = 0;
			for (j = 0; j < 9; ++j) {
				if (i % 2 == 0) {
					num[j] = sc.nextInt();
				} else {
					str[j] = sc.next();
					if (str[j].equals("R")) {
						R[k] = j;
						++k;
					} else if (str[j].equals("B")) {
						B[m] = j;
						++m;
					} else {
						G[n] = j;
						++n;
					}
				}
			}
			if (i % 2 == 1) {
				// Rのときに条件を満たすものを探す
				for (l = 0; l < 9; ++l) {
					count1[l] = 0;
				}
				count2 = 0;
				max = 0;
				min = 0;
				for (l = 0; l < k; ++l) {
					++count1[num[R[l]]];
					// 同じ数字が三つあるとき
					if (count1[num[R[l]]] == 3) {
						++count2;
						count1[num[R[l]]] = 0;
					}
					// 数字の最大、最小を探す
					if (num[R[max]] < num[R[l]]) {
						max = l;
					}
					if (num[R[min]] > num[R[l]]) {
						min = l;
					}
				}
				// 数字が並んでいる時
				if (num[R[max]] - num[R[min]] > 1) {
					for (l = num[R[min]] + 1; l <= num[R[max]] - 1; ++l) {
						if (count1[l] > 0) {
							if (count1[l + 1] > 0 && count1[l - 1] > 0) {
								++count2;
								--count1[l + 1];
								--count1[l];
								--count1[l - 1];
								++l;
							}
						}
					}
				}
				// B
				for (l = 0; l < 9; ++l) {
					count1[l] = 0;
				}
				max = 0;
				min = 0;
				for (l = 0; l < m; ++l) {
					++count1[num[B[l]]];
					// 同じ数字が三つあるとき
					if (count1[num[B[l]]] == 3) {
						++count2;
						count1[num[B[l]]] = 0;
					}
					// 数字の最大、最小を探す
					if (num[B[max]] < num[B[l]]) {
						max = l;
					}
					if (num[B[min]] > num[B[l]]) {
						min = l;
					}

				}
				if (num[B[max]] - num[B[min]] > 1) {
					for (l = num[B[min]] + 1; l <= num[B[max]] - 1; ++l) {
						if (count1[l] > 0) {
							if (count1[l + 1] > 0 && count1[l - 1] > 0) {
								++count2;
								--count1[l + 1];
								--count1[l];
								--count1[l - 1];
								++l;
							}
						}
					}
				}
				// G
				for (l = 0; l < 9; ++l) {
					count1[l] = 0;
				}
				max = 0;
				min = 0;
				for (l = 0; l < n; ++l) {
					++count1[num[G[l]]];
					// 同じ数字が三つあるとき
					if (count1[num[G[l]]] % 3 == 0) {
						++count2;
					}
					// 数字の最大、最小を探す
					if (num[G[max]] < num[G[l]]) {
						max = l;
					}
					if (num[G[min]] > num[G[l]]) {
						min = l;
					}

				}
				if (num[G[max]] - num[G[min]] > 1) {
					for (l = num[G[min]] + 1; l <= num[G[max]] - 1; ++l) {
						if (count1[l] > 0) {
							if (count1[l + 1] > 0 && count1[l - 1] > 0) {
								++count2;
								--count1[l + 1];
								--count1[l];
								--count1[l - 1];
								++l;
							}
						}
					}
				}
				if (count2 == 3) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
		}
		sc.close();
	}

}


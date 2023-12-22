

import java.util.Scanner;

public class Main {

	int SIZE = 80;
	int[] ans;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int l = 0; l < n; l++) {
			// 80ケタの数字は扱えないので文字列に
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();

			// 入力が80ケタを超える
			if (a.length > SIZE || b.length > SIZE) {
				System.out.println("overflow");
				continue;
			}

			// 文字列⇒配列に
			int[] x = new int[a.length];
			int[] y = new int[b.length];
			for (int i = 0; i < a.length; i++) {
				x[i] = a[i] - '0';
			}
			for (int i = 0; i < b.length; i++) {
				y[i] = b[i] - '0';
			}

			// 大きい桁数+1だけ答えの配列をとる
			if (x.length >= y.length) {
				ans = new int[x.length + 1];
			} else {
				ans = new int[y.length + 1];
			}

			int i = x.length - 1;
			int j = y.length - 1;
			int k = ans.length - 1;
			int count = 0;
			boolean flag = false;

			// 同じ桁数の計算
			while (i >= 0 && j >= 0) {
				count++;
				ans[k] += (x[i] + y[j]);
				// 繰り上がり処理
				if (ans[k] >= 10) {
					if (count < SIZE) {
						ans[k - 1] = 1;
						ans[k] -= 10;
					} else {
						flag = true;
					}
				}
				i--;
				j--;
				k--;
			}

			if (i > j) {
				while (i >= 0) {
					count++;
					ans[k] += x[i];
					// 繰り上がり処理
					if (ans[k] >= 10) {
						if (count < SIZE) {
							ans[k - 1] = 1;
							ans[k] -= 10;
						} else {
							flag = true;
						}
					}
					k--;
					i--;
				}
			} else {
				while (j >= 0) {
					count++;
					ans[k] += y[j];
					// 繰り上がり処理
					if (ans[k] >= 10) {
						if (count < SIZE) {
							ans[k - 1] = 1;
							ans[k] -= 10;
						} else {
							flag = true;
						}
					}
					k--;
					j--;
				}
			}

			if (flag) {
				System.out.println("overflow");
				continue;
			}

			for (int m = 0; m < ans.length; m++) {
				if (m == 0 && ans[m] == 0) {
					continue;
				}
				System.out.print(ans[m]);
			}
			System.out.println();
		}

		sc.close();
	}

	// void run1() {
	// Scanner sc = new Scanner(System.in);
	// int n = sc.nextInt();
	//
	// for (int k = 0; k < n; k++) {
	// // char[] a = new char[SIZE];
	// // char[] b = new char[SIZE];
	//
	// int[] x = new int[SIZE];
	// int[] y = new int[SIZE];
	// int[] ans = new int[SIZE];
	//
	// char[] a = sc.next().toCharArray();
	// char[] b = sc.next().toCharArray();
	//
	// if (a.length > 80 || b.length > 80) {
	// System.out.println("overflow");
	// continue;
	// }
	//
	// for (int i = 0; i < a.length; i++) {
	// x[i] = a[i] - '0';
	// }
	//
	// for (int i = 0; i < b.length; i++) {
	// y[i] = b[i] - '0';
	// }
	//
	// int i = a.length - 1;
	// int j = b.length - 1;
	// int l = 0;
	// boolean flag = true;
	//
	// while (i >= 0 || j >= 0) {
	// if (j < 0) {
	// while (i >= 0) {
	// ans[l] += x[i];
	// if (ans[l] >= 10) {
	// ans[l] -= 10;
	// if (l + 1 >= 80) {
	// flag = false;
	// break;
	// }
	// ans[l + 1] = 1;
	// }
	// l++;
	// i--;
	// }
	// break;
	// }
	//
	// if (i < 0) {
	// while (j >= 0) {
	// ans[l] += y[j];
	// if (ans[l] >= 10) {
	// ans[l] -= 10;
	// if (l + 1 >= 80) {
	// flag = false;
	// break;
	// }
	// ans[l + 1] = 1;
	// }
	// l++;
	// j--;
	// }
	// break;
	// }
	//
	// ans[l] += (x[i] + y[j]);
	// if (ans[l] >= 10) {
	// ans[l] -= 10;
	// if (l + 1 >= 80) {
	// flag = false;
	// break;
	// }
	// ans[l + 1] = 1;
	// }
	// l++;
	// i--;
	// j--;
	// }
	//
	// if (!flag) {
	// System.out.println("overflow");
	// }
	// else {
	// if (ans[l] == 1) {
	// l++;
	// }
	// for (int m = l - 1; m >= 0; m--) {
	// System.out.print(ans[m]);
	// }
	// System.out.println();
	// }
	//
	// }
	//
	// sc.close();
	// }

	public static void main(String[] args) {
		new Main().run();
	}

}
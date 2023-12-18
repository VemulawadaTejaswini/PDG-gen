import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 冊数
		int M = sc.nextInt(); // アルゴリズム数
		int X = sc.nextInt();

		int C[][] = new int[N][M + 1];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M + 1; j++) {
				C[i][j] = sc.nextInt();
			}
		}

		int tmp[] = new int[M + 1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M + 1; j++) {
				tmp[j] += C[i][j];
			}
		}

		int total[] = new int[M + 1];
		List<Integer> lists = new ArrayList<Integer>();

		recursive_check(total, C, N - 1, M + 1, X, lists);

		Collections.sort(lists);

		if (lists == null || lists.size() == 0) {
			System.out.println("-1");
		}

		for (Integer a : lists) {
			System.out.println(a);
			return;
		}

		sc.close();

	}

	public static void recursive_check(int[] total, int[][] A, int n, int M, int X, List<Integer> list) {
		//		System.out.println(n);
		if (n == 0) {
			//System.out.print("X" + X);
			boolean flg = false;
			//System.out.println();
			for (int i = 0; i < M; i++) {
			//	System.out.print(total[i]+ " ");
				if ( i != 0 && X > total[i]) {
					flg = true;
				}
			}
		//	System.out.println();
			if (!flg)
				list.add(total[0]);

			flg = false;

			add(total, A[n]);
			for (int i = 0; i < M; i++) {
	//			System.out.print(total[i]+ " ");
				if ( i != 0 && X > total[i]) {
					flg = true;
				}
			}
//			System.out.println();
			if (!flg)
				list.add(total[0]);

			sub(total,A[n]);
			return;

		} else {
			recursive_check(total, A, n - 1, M, X, list);

			add(total, A[n]);
			recursive_check(total, A, n - 1, M, X, list);
			sub(total,A[n]);

		}
	}

	public static int[] add(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i] += b[i];
		}
		return a;
	}

	public static int[] sub(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i] -= b[i];
		}
		return a;
	}

}
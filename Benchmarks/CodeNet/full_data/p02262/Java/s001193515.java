import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		shellSort(c, n);
		in.close();
	}

	private static int insertionSort(int[] A, int n, int g) {
		int v;
		int j;
		int cnt = 0;
		for (int i = g; i < n; i++) {
			v = A[i];
			j = i - g;
			while (j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j - g;
				cnt += 1;

			}

			A[j + g] = v;
		}
		return cnt;
	}

	private static void shellSort(int[] A, int n) {
		int m = 0;
		int[] G = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			G[i] = (i * 3) + 1;
			if (G[i] > n) {
				break;
			}
			m += 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = m-1; i >=0; i--) {
			cnt+=insertionSort(A, n, G[i]);
			if (i !=m-1) {
				sb.append(" ");
			}
			sb.append(G[i]);
		}
		System.out.println(m);
		System.out.println(sb.toString());
		System.out.println(cnt);
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
	}

}


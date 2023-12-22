import java.util.Scanner;


public class Main {

	static long[] cut(long org, int pos) {
		long[] results = new long[2];
		long scale = (long) Math.pow(10, pos+1);
		long o1 = org - scale * (org / scale);
		scale = (long) Math.pow(10, pos);
		long o2 = org - scale * (org / scale);
		results[0] = (o1 - o2) / scale;
		long o3 = (org - o1) / 10;
		results[1] = o3 + o2;
		return results;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		cut(12345, 0);

		long[][] tree = new long[10][10*9*8*7*6*5*4*3*2+1];
		long[][] remain = new long[10][10*9*8*7*6*5*4*3*2+1];

		int i;
		for (i = 0 ; i < 10 ; i++) {
			tree[0][i] = i;
			remain[0][i] = Long.parseLong((new StringBuilder("9876543210")).deleteCharAt(9-i).toString());
		}
		tree[0][i] = -1;

		for (i = 1 ; i < 10 ; i++) {
			int j = 0, l = 0;
			while (tree[i-1][j] >= 0) {
				for (int k = 0 ; k < 10-i ; k++) {
					long[] c = cut(remain[i-1][j], k);
					tree[i][l] = tree[i-1][j]*10 + c[0];
					remain[i][l] = c[1];
					l++;
				}
				j++;
			}
			tree[i][l] = -1;
		}

		while (sc.hasNextInt()) {
			int N = sc.nextInt(),
				S = sc.nextInt();

			i = 0;
			int count = 0;
			while (tree[N-1][i] >= 0) {
				int s = 0;
				for (int n = 0 ; n < N ; n++) {
					s += (n+1) * (cut(tree[N-1][i], N-n-1))[0];
				}
				if (s == S) {
					count++;
					System.out.println(tree[N-1][i]);
				}
				i++;
			}
			System.out.println(count);
		}
	}
}
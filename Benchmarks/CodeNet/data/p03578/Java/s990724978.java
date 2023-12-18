import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] t = new int[m];

		for (int i = 0; i < m; i++) {
			t[i] = sc.nextInt();
		}

		Arrays.sort(d);
		Arrays.sort(t);

		boolean isCpl = true;
		int idxD = 0;
		int idxT = 0;
		while (idxT < m) {
			if (idxD == n) {
				isCpl = false;
				break;
			}

			if (t[idxT] == d[idxD]) {
				idxT++;
				idxD++;
			} else {
				idxD++;
			}
		}

		System.out.println(isCpl ? "YES" : "NO");

		sc.close();
	}

}

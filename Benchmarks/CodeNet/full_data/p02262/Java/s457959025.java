import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			String kari = sc.nextLine();
			A[i] = Integer.parseInt(kari);
		}

		int v = 0;
		int k = 0;

		int cnt = 0;
		int m = 2;
		int[] G = {4, 1};

		for (int i = 0; i < m; i++) {
			for (int j = G[i]; j < n; j++) {
				v = A[j];
				k = j - G[i];
				while (k >= 0 && A[k] > v) {
					A[k + G[i]] = A[k];
					k = k - G[i];
					cnt++;
				}
				A[k + G[i]] = v;
			}
		}

		System.out.println("2");
		System.out.println("4 1");
		System.out.println(cnt);
		for (int l = 0; l < n; l++) {
			System.out.println(A[l]);

		}

	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] a = new int[3][n+1];
		for (int i=1; i<=2; i++) {
			for (int j=1; j<=n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int dmax = 0;
		int aup = 0;
		int adown = 0;
		for (int k=1; k<=n; k++) {
			for (int i=1; i<=k; i++) {
					aup += a[1][i];
			}
			for (int i=k; i<=n; i++) {
				adown += a[2][i];
			}
			dmax = Math.max(dmax, aup+adown);
			aup = 0;
			adown = 0;
		}
		System.out.println(dmax);
	}

}
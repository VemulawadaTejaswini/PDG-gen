import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int A[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j] = in.nextInt();
			}
		}
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = in.nextInt();
		}

		int ans[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ans[i] += A[i][j]*b[j];
			}
		}

		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}
}
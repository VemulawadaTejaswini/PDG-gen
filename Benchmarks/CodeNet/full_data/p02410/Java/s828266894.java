import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int a[][] = new int [n][m];
		int b[] = new int[m];
		int ans[] = new int[n];
		int k,c,l,i,j;

		for(k=0;k<n;k++) {
			for(c=0;c<m;c++) {
				a[k][c] = scan.nextInt();
			}
		}

		for(l=0;l<m;l++) {
			b[l] = scan.nextInt();
		}

		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				ans[i] += a[i][j] * b[j];
			}
			System.out.println(ans[i]);
		}
		scan.close();

	}

}


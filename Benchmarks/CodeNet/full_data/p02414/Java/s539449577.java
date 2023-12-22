import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, l;
		n = in.nextInt();
		m = in.nextInt();
		l = in.nextInt();
		int A[][] = new int[n][m];
		int B[][] = new int[m][l];

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j] = in.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<l;j++) {
				B[i][j] = in.nextInt();
			}
		}

		int c[][] = new int[n][l];
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				for(int k=0;k<m;k++) {
					c[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			String s = "";
			for(int j=0;j<l;j++) {
				s += c[i][j] + " ";
			}
			System.out.println(s.substring(0, s.length()-1));
		}
	}
}
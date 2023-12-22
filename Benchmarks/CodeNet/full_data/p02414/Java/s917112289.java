import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		int[][] A=new int[n][m];
		int[][] B=new int[m][l];
		int[][] C=new int[n][l];

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int a=sc.nextInt();
				A[i][j]=a;
			}

		}

		for(int i=0;i<m;i++) {
			for(int j=0;j<l;j++) {
				int b=sc.nextInt();
				B[i][j]=b;
			}

		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				for(int k=0;k<m;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();

		}
	}
}

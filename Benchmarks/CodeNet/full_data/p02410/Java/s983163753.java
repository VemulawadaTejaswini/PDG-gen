import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int A[][]=new int[n][m];
		int b[]=new int[m];
		int c[]=new int[n];


		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int ai=sc.nextInt();
				A[i][j]=ai;
			}
		}
		for(int k=0;k<m;k++) {
			int bm=sc.nextInt();
			b[k]=bm;
		}
		for(int l=0;l<n;l++) {
			for(int p=0;p<m;p++) {
				c[l]+=A[l][p]*b[p];
			}
			System.out.println(c[l]);
		}



	}
}

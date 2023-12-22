import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int m=scan.nextInt();
			int l=scan.nextInt();
			int a[][] =new int[100][100];
			int b[][] =new int[100][100];
			int c[][] = new int[100][100];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<l;j++) {
					b[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<l;j++) {
					for(int k=0;k<m;k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			for(int i=0;i<n;i++) { 
				for(int j=0;j<l;j++) {
					System.out.printf(c[i][j]+" ");
				}
				System.out.println("");
			}
		scan.close();
}
}

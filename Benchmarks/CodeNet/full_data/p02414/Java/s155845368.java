import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//System.out.prlong("2x3行列と3x2行列の積を求めます\n");

		int n = sc.nextInt(); // 3
		int m = sc.nextInt(); // 2
		int l = sc.nextInt(); // 3

		long a[][]=new long[n][m];
		long b[][]=new long[m][l];
		long c[][]=new long[n][l];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				long num=sc.nextInt();
				a[i][j]=num;
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<l;j++){
				long num=sc.nextInt();
				b[i][j]=num;

			}
		}

		sc.close();

		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				long sum=0;
				for(int k=0;k<m;k++){
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;

			}

		}
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++) {
				System.out.print(c[i][j]);
				if(j != l-1) System.out.print(" ");
			}
			System.out.println("");
		}
	}
}

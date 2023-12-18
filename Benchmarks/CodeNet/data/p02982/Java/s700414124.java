import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		long MOD=1000000007L;

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int d=sc.nextInt();
		int mat[][]=new int[n][d];
		long L[][]=new long[n][n];
		for(int i=0;i<n;++i){
			for(int j=0;j<d;++j){
				mat[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<n-1;++i){
			for(int j=i+1;j<n;++j){
				double sum=0L;
				for(int k=0;k<d;++k){
					sum=sum+(mat[i][k]-mat[j][k])*(mat[i][k]-mat[j][k]);
				}
				if (Math.pow(sum, 0.5)%1==0)++count;
			}
		}


		System.out.println(count);
	}
}
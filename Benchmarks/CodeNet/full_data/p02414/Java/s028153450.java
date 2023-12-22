import java.util.Scanner;

public class Main {

	static void input(long[][] array,int y,int x,Scanner scan){
		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				array[i][j]=scan.nextInt();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int l=scan.nextInt();
		long[][] A=new long[n][m];
		long[][] B=new long[m][l];
		long sum;
		input(A,n,m,scan);
		input(B,m,l,scan);
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				
				sum=0;
				for(int k=0;k<m;k++){
					sum+=A[i][k]*B[k][j];
				}
				if(j==0){
					System.out.print(sum);
				}else{
					System.out.print(" "+sum);
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
import java.util.Scanner;
class Main{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,m,l;
		int[][] A=new int[101][101];
		int[][] B=new int[101][101];
		long [][] C=new long[101][101];
		n=sc.nextInt();
		m=sc.nextInt();
		l=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=l;j++){
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=l;j++){
				C[i][j]=0;
				for(int k=1;k<=m;k++){
					C[i][j]+=(A[i][k]*B[k][j]);
				}
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<l;j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println(C[i][l]);
		}
    }
}



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a=new int[m+1][n+1];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=sc.nextInt();
				a[i][n]+=a[i][j];

			}
		}
		for(int j=0; j<=n; j++){
			for(int i=0; i<m; i++){
				a[m][j]+=a[i][j];
			}
		}
		printintMat(a);



	}
	public static void printintMat(int A[][]){
		//行列のプリントアウト
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[0].length-1; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.print(A[i][A[0].length-1]);
			System.out.println();
	}

		}


}

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int A[][] = new int[n][m];
		int B[][] = new int[m][l];
		int i,j,k;
		long c;
		for(i=0; i<n; i++){
			for(j=0; j<m; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(j=0; j<m; j++){
			for(k=0; k<l; k++){
				B[j][k] = sc.nextInt();
			}
		}
		for(i=0; i<n; i++){
			for(k=0; k<l; k++){
				c = 0;
				for(j=0; j<m; j++){
					c += ( A[i][j] * B[j][k] );
				}
				if(k!=0) System.out.print(" ");
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
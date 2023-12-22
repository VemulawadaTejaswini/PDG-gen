import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int A[][] = new int[n][m];
		int b[] = new int[m];
		int i,j,c;
		for(i=0; i<n; i++){
			for(j=0; j<m; j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(j=0; j<m; j++){
			b[j] = sc.nextInt();
		}
		for(i=0; i<n; i++){
			c = 0;
			for(j=0; j<m; j++){
				c += ( A[i][j] * b[j] );
			}
			System.out.println(c);
		}
	}
}
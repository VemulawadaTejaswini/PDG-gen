import java.util.Scanner;

class Main {

	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int m, n;
		int a1, a2, a3, a4;
		int c;
		int a[][];
		
		n = scan.nextInt();
		m = scan.nextInt();
		a = new int[n + 1][m + 1];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a1 = scan.nextInt();
				a[i][j] = a1;
				a[n][j] += a1;
				a[i][m] += a1;
			}
			a[n][m] += a[i][m];
		}
		
		for(int i = 0; i <= n; i++){
			for(int j = 0; j <= m; j++){
				System.out.print(a[i][j]);
				if(j != m){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}
}	
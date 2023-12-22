import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		long[][] a = new long[n][m];
		long[][] b = new long[m][l];
		long[][] c = new long[n][l];
		long sum = 0;
		//a???????????????
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				a[i][j] = scan.nextLong();
			}
		}
		//b???????????????
		for(int i=0; i<m; i++){
			for(int j=0; j<l; j++){
				b[i][j] = scan.nextLong();
			}
		}
		//??????c?????????????´?
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				sum = 0;
				for(int k=0; k<m; k++){
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		//???????????????
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				System.out.print(c[i][j]);
				if(j < l-1){
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
    }
}
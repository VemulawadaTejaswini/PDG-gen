import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		long[][] array_A = new long[n][m];
		long[][] array_B = new long[m][l];
		long[][] array_C = new long[n][l];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				array_A[i][j] = scan.nextInt(); 
			}
		}

		for(int i=0; i<m; i++){
			for(int j=0; j<l; j++){
				array_B[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i<n; i++){
			for(int j=0; j<l; j++){
				for(int k = 0; k<m; k++){
					array_C[i][j] += array_A[i][k]*array_B[k][j];
				}
			}
		}

		for(int i = 0; i<n; i++){
            System.out.print(array_C[i][0]);
            for(int j=1;j<l;j++){
                System.out.print(" "+array_C[i][j]);  
        }
        System.out.println();
    	}

	}
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        int [][]A;
        A = new int[n][m];
        int [][]B;
        B = new int[m][l];
        int [][]C;
        C = new int[n][l];
        int i,j,k;

        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
            A[i][j] = scan.nextInt();
            }
        }
        for(j = 0; j < m; j++){
            for(k = 0; k < l; k++){
            B[j][k] = scan.nextInt();
            }
        }
        for(k = 0; k < l; k++){
            for(j = 0; j < m; j++){
                for(i = 0; i < n; i++){
                C[i][k] += A[i][j]*B[j][k];
                }
            }
        }
        for(i = 0; i< n; i++){
        	for(k = 0; k< l; k++){
        		if(k != l-1){
        			System.out.print(C[i][k]+" ");
        		}
        		else{
        			System.out.println(C[i][k]);
        		}
        	}
        }      
    }
}     
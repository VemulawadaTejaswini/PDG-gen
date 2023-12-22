import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        // ??\???
        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        // ??????A n x m
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = scan.nextInt();
            }
        } 
        // ??????B m x l
        int[][] B = new int[m][l];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                B[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        // ??????
        // ??????C n x l
        // i = n, j = l, k = m
        int[][] C = new int[n][l];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                for(int k = 0; k < m; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
                 System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
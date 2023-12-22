import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = scan.nextInt();
            }
        }
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = scan.nextInt();
        }
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                c[i] += A[i][j] * b[j];
            }
            System.out.println(c[i]);
        }
        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] n = new int[r + 1][c + 1];

        for(int i = 0; i < r; i++)
            n[i][c] = 0;

        for(int i = 0; i < c; i++)
            n[r][i] = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                n[i][j] = A[i][j];
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                n[i][c] += A[i][j];
        }

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++)
                n[r][i] += A[j][i];
        }

        n[r][c] = 0;
        for(int i = 0; i< r; i++){
            for(int j = 0; j < c; j++)
                n[r][c] += A[i][j];
        }

        for(int i = 0; i <= r; i++){
            System.out.print(n[i][0]);
            for(int j = 1; j <= c; j++)
                System.out.print(" " + n[i][j]);
            System.out.println("");
        }

        sc.close();
    }
}

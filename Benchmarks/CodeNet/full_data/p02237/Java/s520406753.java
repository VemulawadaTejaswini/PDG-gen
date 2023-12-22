import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Adj = new int[n][n];
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j < b; j++){
                int c = sc.nextInt();
                Adj[a - 1][c - 1] = 1;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(Adj[i][j]);
                if (j < n - 1){
                    System.out.print(" ");
                }
                else {
                    System.out.println();
                }
            }
        }
    }
}


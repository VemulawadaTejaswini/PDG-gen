

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = 0;
            }
        }
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                int t = sc.nextInt();
                arr[i][t-1] = 1;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j > 0) System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}


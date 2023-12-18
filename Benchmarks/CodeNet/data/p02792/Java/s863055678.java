import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] counts = new int[10][10];
        for (int i = 1; i < N+1; i++) {
            int btm = i % 10;
            int top = -1, x = i;
            while(-0 < x){
                top = x % 10;
                x /= 10;
            }
            counts[top][btm]++;
        }

        int ans = 0;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                ans += counts[i][j] * counts[j][i];
            }
        }
        System.out.println(ans);
    }
}
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final String A = sc.next();
        sc.close();
        int[][] n = new int[N][N];
        for (int i = 0; i < N; i++) {
            n[0][i] = A.charAt(i);
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i + j < N){
                    n[i][j] = n[i - 1][j] - n[i - 1][j + 1];
                    if(n[i][j] < 0)
                        n[i][j] *= -1;
                }
            }
        }
        System.out.println(n[N - 1][0]);
    }
}
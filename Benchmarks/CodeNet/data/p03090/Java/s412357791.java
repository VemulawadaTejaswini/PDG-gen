import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] g = new boolean[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i != j) {
                    g[i][j] = true;
                }
            }
        }
        for (int i = 1; i <= N/2; i++) {
            int a = i;
            int b = N-i;
            g[a][b] = false;
            g[b][a] = false;
        }
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = i+1; j <= N; j++) {
                if (g[i][j]) {
                    count++;
                    ans.append(i+" "+j+"\n");
                }
            }
        }
        System.out.println(count);
        System.out.print(ans);
    }
}

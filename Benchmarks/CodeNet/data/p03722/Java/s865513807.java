import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] map = new int[n+1][n+1];
        long[] d = new long[n+1];
        final int INF = 1000000001;
        for (int i = 0; i < n+1; i++) {
            Arrays.fill(map[i],-INF);
        }
        Arrays.fill(d,-INF);
        d[1] = 0;
        boolean isInf = false;
        for (int i = 0; i < m; i++) {
            map[scanner.nextInt()][scanner.nextInt()] = scanner.nextInt();
        }
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++) {
                if (d[j] < d[i] + map[i][j]){
                    d[j] = d[i] + map[i][j];
                    if (i == n){
                        isInf = true;
                    }
                }
            }
        }
        if (isInf){
            System.out.println("inf");
        }else{
            System.out.println(d[n]);
        }

    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        int[] c = new int[M];
        long[] d = new long[N+1];
        final int INF = 1000000001;
        for (int i = 0; i < M; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = -scanner.nextInt();
        }
        for (int i = 0; i < N+1; i++) {
            Arrays.fill(d,INF);
        }
        boolean[] loop = new boolean[N+1];
        boolean isInf = false;
        d[1] = 0;
        loop[1] = true;
        for (int i = 0; i < M; i++) {
            if (d[b[i]] == INF || d[b[i]] > d[a[i]] + c[i]){
                d[b[i]] = d[a[i]] + c[i];
                loop[b[i]] = true;
                if (a[i] == N && loop[b[i]]){
                    isInf = true;
                }
            }
        }
        if (isInf){
            System.out.println("inf");
        }else {
            System.out.println(-d[N]);
        }
    }
}

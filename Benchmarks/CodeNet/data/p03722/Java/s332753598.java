import java.util.*;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];
        long[] c = new long[N];

        for(int i = 0; i < M; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            c[i] = -sc.nextLong();
        }

        long[] dist = new long[N];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        for(int loop = 0; loop < N; loop++) {
            for(int i = 0;i < M; i++) {
                if(dist[a[i]] == Long.MAX_VALUE) continue;

                if(dist[b[i]] > dist[a[i]] + c[i]) {
                    dist[b[i]] = dist[a[i]] + c[i];
                }
            }
        }

        boolean ok = true;
        for(int i = 0; i < M; i++ ){
            if(dist[a[i]] + c[i] < dist[b[i]]) {
                ok = false;
            }
        }
        if(ok) System.out.println(-dist[N - 1]);
        else System.out.println("inf");
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] x = new Integer[N];
        for (int i=0;i<N;i++) {
            x[i] = sc.nextInt();
        }
        int L = sc.nextInt();

        int[][] parent = new int[30][N];
        for (int i=0;i<N;i++) {
            parent[0][i] = ~Arrays.binarySearch(x, x[i]+L, (o1, o2)->o1>o2?1:-1)-1;
        }
        for (int j=0;j<29;j++) {
            for (int i=0;i<N;i++) {
                if (parent[j][i]!=N-1) {
                    parent[j+1][i] = parent[j][parent[j][i]];
                } else {
                    parent[j+1][i] = N-1;
                }
            }
        }
        // System.out.println(Arrays.deepToString(parent));
        int Q = sc.nextInt();
        for (int i=0;i<Q;i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if (a>b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            int ok = 1_000_000;
            int ng = -1;
            while (Math.abs(ok-ng)>1) {
                int mid = (ok+ng)/2;
                int tmp = a;
                for (int j=0;j<25;j++) {
                    if ((mid&(1<<j))==(1<<j)) {
                        if (tmp!=N) tmp = parent[j][tmp];
                    }
                }
                if (tmp>=b) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            System.out.println(ok);
        }
    }
}
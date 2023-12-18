import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        ArrayList<int[]> edge = new ArrayList<int[]>();
        for (int i=0;i<M;i++) {
            int A = Integer.parseInt(sc.next())-1;
            int B = Integer.parseInt(sc.next())-1;
            int C = Integer.parseInt(sc.next());
            int[] add = {A, B, -(C-P)};
            edge.add(add);
        }
        long[] values = new long[N];
        long INF = 1_000_000_000_000_000L;
        Arrays.fill(values, INF);
        values[0] = 0;

        long val_N = 0;
        long val_2N = -1;
        for (int i=0;i<2*N;i++) {
            for (int j=0;j<M;j++) {
                int[] tmp = edge.get(j);
                int A = tmp[0];
                int B = tmp[1];
                int C = tmp[2];
                if (values[A]!=INF && values[B]>values[A]+C) {
                    values[B] = values[A]+C;
                }
            }
            if (i==N-1) val_N = values[N-1];
            if (i==2*N-1) val_2N = values[N-1];
        }

        if (val_N!=val_2N) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(-values[N-1], 0));
        }
    }
}
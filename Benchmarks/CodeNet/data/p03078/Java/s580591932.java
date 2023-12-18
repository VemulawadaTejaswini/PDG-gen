import java.util.*;

public class Main {

    int X, Y, Z, K;
    long[] A;
    long[] B;
    long[] C;
    PriorityQueue<Long> pq;

    public Main() {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        K = sc.nextInt();
        A = new long[X];
        B = new long[Y];
        C = new long[Z];
        for (int x = 0; x < X; x += 1) {
            A[x] = Long.parseLong(sc.next());
        }
        for (int y = 0; y < Y; y += 1) {
            B[y] = Long.parseLong(sc.next());
        }
        for (int z = 0; z < Z; z += 1) {
            C[z] = Long.parseLong(sc.next());
        }
    }

    private void solve() {
        pq = new PriorityQueue<>(Comparator.reverseOrder());
        int cnt = 0;
        long min = Long.MAX_VALUE;
        for (long Ak : A) {
            for (long Bk : B) {
                for (long Ck : C) {
                    long priority = Ak + Bk + Ck;
                    if (cnt > K && priority < min) {
                        continue;
                    } else {
                        pq.add(priority);
                        cnt += 1;
                        min = priority < min ? priority : min;
                    }
                }
            }
        }
    }

    public static void main (String[]args){
        Main main = new Main();
        main.solve();
        for (int k = 0; k < main.K; k += 1) {
            System.out.println(main.pq.poll());
        }
    }

}

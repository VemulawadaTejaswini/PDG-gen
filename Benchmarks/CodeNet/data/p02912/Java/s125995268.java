import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        Queue<Long> Q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n = 0; n < N; n++) {
            Q.add(in.nextLong());
        }

        for (int m = 0; m < M; m++) {
            long a = Q.poll();
            Q.add(a / 2);
        }

        long res = 0;
        for (int n = 0; n < N; n++) {
            res += Q.poll();
        }

        System.out.println(res);
    }
}


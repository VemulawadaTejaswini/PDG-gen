import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solvePriorityQueue(N, M, A));
    }


    private static long solvePriorityQueue(int N, int M, int[] A) {
        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer ;
            }
        });

        for (int i=0; i<N; i++) {
            que.add(A[i]);
        }

        for (int i=0; i<M; i++) {
            int top = (int)que.poll();
            que.add(top/2);
        }

        long sum = 0;
        while(!que.isEmpty()) {
            sum += que.poll();
        }

        return sum;
    }
}
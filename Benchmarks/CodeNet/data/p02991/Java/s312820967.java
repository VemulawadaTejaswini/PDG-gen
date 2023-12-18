import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        List<Integer>[] list = new List[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            list[a].add(b);
        }
        int S = scanner.nextInt() - 1;
        int T = scanner.nextInt() - 1;
        final int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[S] = 0;
        /*
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(){
            @Override
            public Comparator<? super int[]> comparator() {
                return (Comparator<int[]>) (o1, o2) -> {
                    return o1[1] - o2[1];
                };
            }
        };
        */
        final Queue<Integer> q = new LinkedList<>();
        q.add(S);
        while(!q.isEmpty()) {
            final int s = q.poll();
            final int nextStep = dp[s] + 1;
            /*
            for (final int next : list[s]) {
                if (nextStep < dp[next]) {
                    dp[next] = nextStep;
                    q.add(next);
                }
            }*/
            for (final int n1 : list[s]) {
                for (final int n2 : list[n1]) {
//                    if ((n2 == n1) || (n2 == s)) {
//                        continue;
//                    }
                    for (final int n3 : list[n2]) {
//                        if ((n3 == n2) || (n3 == n1) || (n3 == s)) {
//                            continue;
//                        }
                        if (nextStep < dp[n3]) {
                            dp[n3] = nextStep;
                            q.add(n3);
                        }
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(dp));

        if (dp[T] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[T]);
        }
    }
}

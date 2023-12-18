import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.solve();
    }
    private void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int R = scan.nextInt();
        int[] r = new int[R];
        for (int i = 0; i < R; i++) {
            r[i] = scan.nextInt()-1;
        }
        int[][] distance = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            int c = scan.nextInt();
            distance[a][b] = c;
            distance[b][a] = c;
        }
        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = distance[i][j];
            }
        }
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (dp[i][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    if (dp[k][j] == Integer.MAX_VALUE) {
                        continue;
                    }
                    dp[i][j] = Math.min(dp[i][j],dp[i][k] + dp[k][j]);
                }
            }
        }
        LinkedList<Integer> candidates = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            candidates.add(r[i]);
        }
        int answer = Integer.MAX_VALUE;
        List<LinkedList<Integer>> target = permutation(candidates);
        for (LinkedList<Integer> x : target) {
            int prev = x.poll();
            int cost = 0;
            while(!x.isEmpty()) {
                int current = x.poll();
                cost += dp[prev][current];
                prev = current;
            }
            answer = Math.min(answer, cost);
        }
        System.out.println(answer);
    }
    public List<LinkedList<Integer>> permutation(LinkedList<Integer> candidate) {
        if (candidate.size() == 0) {
            List<LinkedList<Integer>> empty = new ArrayList<>();
            empty.add(new LinkedList<>());
            return empty;
        }
        List<LinkedList<Integer>> result = new ArrayList();
        for (int i = 0; i < candidate.size(); i++) {
            LinkedList<Integer> remain = new LinkedList<>(candidate);
            int removed = remain.remove(i);
            List<LinkedList<Integer>> sublist = permutation(remain);
            for (LinkedList<Integer> x : sublist) {
                x.add(0, removed);
                result.add(x);
            }
        }
        return result;
    }
}

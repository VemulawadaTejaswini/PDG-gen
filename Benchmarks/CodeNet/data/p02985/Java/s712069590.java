
import java.util.*;

public class Main {

    class P {
        int idx, cost;

        public P(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long MOD = (long) 1e9 + 7;

        List<Integer>[] arr = new List[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            arr[a].add(b);
            arr[b].add(a);
        }

        boolean[] visited = new boolean[n];
        ArrayDeque<P> q = new ArrayDeque<>();

        long combi = 1;
        q.add(new P(0, k));
        int loopCounter = 0;
        while (!q.isEmpty()) {
            P curP = q.peek();
            int cur = curP.idx;
            combi = curP.cost * combi % MOD;
            List<Integer> l = arr[cur];
            int count = 0;
            for (int i : l) {
                int next = i;
                if (!visited[next]) {
                    q.add(new P(next, loopCounter == 0 ? k - 1 - count : k - 2 - count));
                    count++;
                }
            }
            visited[cur] = true;
            loopCounter++;
            q.pop();
        }

        System.out.println(combi);

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

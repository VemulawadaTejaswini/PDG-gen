import java.util.*;

public class Main {
    public static int solve(int N, int M, int[] x, int[] y) {
        List<Integer>[] adj = new List[N];
        for (int i = 0; i < N; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) adj[x[i]-1].add(y[i]-1);

        int[] longest = new int[N];
        Arrays.fill(longest, -1);

        int  maxLength = -1;
        for (int from = 0; from < N; from++)
            if (longest[from] == -1)
                maxLength = Math.max(maxLength, dfs(from, adj, longest));

        return maxLength;
    }

    private static int dfs(int from, List<Integer>[] adj, int[] longest) {
        if (longest[from] != -1) return longest[from];

        int currentLongest = 0;
        for (int to: adj[from])
            currentLongest = Math.max(currentLongest, 1 + dfs(to, adj, longest));

        longest[from] = currentLongest;
        return currentLongest;
    }

    public static void main(String[] args) {
        int N, M;
        int[] x, y;

        try (Scanner scanner = new Scanner(System.in)) {
            N = scanner.nextInt();
            M = scanner.nextInt();
            x = new int[M];
            y = new int[M];
            for (int i=0; i < M; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
        }

        int result = solve(N, M, x, y);
        System.out.println(result);

        //Tests.run();
    }
}

class Tests {
    public static void run() {
        testCase(4, 5, new int[] {1,1,3,2,3}, new int[] {2,3,2,4,4}, 3);
        testCase(6, 3, new int[] {2,4,5}, new int[] {3,5,6}, 2);
        testCase(5, 8, new int[] {5,2,2,5,5,1,4,1}, new int[] {3,3,4,2,1,4,3,3}, 3);
        System.out.println("DONE");
    }

    private static void testCase(int N, int M, int[] x, int[] y, int expected) {
        int result = Main.solve(N, M, x, y);
        if (result != expected) System.out.println("N=" + N + " M=" + M + " x=" + Arrays.toString(x) + " y=" + Arrays.toString(y) + " was " + result + " expected " + expected);
    }
}

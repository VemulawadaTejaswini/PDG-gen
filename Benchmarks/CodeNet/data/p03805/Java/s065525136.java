import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] a = new int[M];
            int[] b = new int[M];
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < M; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                adj.get(a[i]).add(b[i]);
                adj.get(b[i]).add(a[i]);
            }
            dfs(0, adj, 1 << 0, N);
            System.out.println(count);
        }
    }

    private static int count = 0;

    private static void dfs(int index, ArrayList<ArrayList<Integer>> adj, int used, int N) {
        if ((used & ((1 << N) - 1)) == ((1 << N) - 1)) {
            count++;
            return;
        }

        for (Integer i : adj.get(index)) {
            if ((used & (1 << i)) == (1 << i)) {
                continue;
            }
            dfs(i.intValue(), adj, used | (1 << i.intValue()), N);
        }
    }
}

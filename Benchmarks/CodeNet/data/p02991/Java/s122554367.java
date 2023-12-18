import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] u = new int[M];
            int[] v = new int[M];
            ArrayList<Integer>[] v2 = new ArrayList[N];
            for (int i = 0; i < v2.length; i++) {
                v2[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < M; i++) {
                u[i] = in.nextInt() - 1;
                v[i] = in.nextInt() - 1;
                v2[u[i]].add(v[i]);
            }
            int S = in.nextInt();
            int T = in.nextInt();

            ArrayList<Integer>[] v3 = new ArrayList[N];
            for (int i = 0; i < v3.length; i++) {
                v3[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < N; i++) {
                for (Integer vertex : v2[i]) {
                    for (Integer vertex2 : v2[vertex]) {
                        for (Integer vertex3 : v2[vertex2]) {
                            if (!v3[i].contains(vertex3)) {
                                v3[i].add(vertex3);
                            }
                        }
                    }
                }
            }

            LinkedList<Integer> queue = new LinkedList<>();
            boolean[] used = new boolean[N];
            {
                queue.add(S);
                used[S] = true;
            }
            for (; !queue.isEmpty();) {
                int v4 = queue.pollFirst().intValue();
                int n = v4 & ((1 << 16) - 1);
                int dist = v4 >>> 16;
                if (n == T) {
                    System.out.println(dist);
                    return;
                }
                for (Integer vertex : v3[n]) {
                    if (used[vertex.intValue()]) {
                        continue;
                    }
                    used[vertex.intValue()] = true;
                    queue.add(((dist + 1) << 16) | vertex.intValue());
                }
            }
            System.out.println(-1);
        }
    }

}

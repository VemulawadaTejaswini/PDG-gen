import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N - 1];
            int[] B = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                A[i] = sc.nextInt() - 1;
                B[i] = sc.nextInt() - 1;
            }

            List<Integer>[] edges = new List[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < N - 1; i++) {
                edges[A[i]].add(B[i]);
                edges[B[i]].add(A[i]);
            }

            int K = Arrays.stream(edges).mapToInt(e -> e.size()).max().getAsInt();

            Map<Integer, Integer>[] colorMap = new Map[N];
            List<Integer>[] colors = new List[N];
            for (int i = 0; i < N; i++) {
                colors[i] = new ArrayList<>(K);
            }

            ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(N);
            queue.add(0);

            while (queue.size() > 0) {
                int v = queue.poll();
                colorMap[v] = new HashMap<>();

                int k = 1;
                for (int v2 : edges[v]) {
                    while (colors[v].contains(k)) {
                        k++;
                    }

                    colors[v2].add(k);
                    colorMap[v].put(v2, k);
                    edges[v2].remove(Integer.valueOf(v));

                    if (edges[v2].size() > 0) {
                        queue.add(v2);
                    }

                    k++;
                }
            }

            StringBuilder ans = new StringBuilder();
            ans.append(K).append("\n");
            for (int i = 0; i < N - 1; i++) {
                Integer c = null;
                if (colorMap[A[i]] != null) {
                    c = colorMap[A[i]].get(B[i]);
                }

                if (c == null) {
                    c = colorMap[B[i]].get(A[i]);
                }

                ans.append(c).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}

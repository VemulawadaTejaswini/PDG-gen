import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] A = new int[N - 1];
            int[] B = new int[N - 1];
            List<Integer>[] edges = new List[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < N - 1; i++) {
                A[i] = sc.nextInt() - 1;
                B[i] = sc.nextInt() - 1;

                edges[A[i]].add(B[i]);
                edges[B[i]].add(A[i]);
            }

            int K = Arrays.stream(edges).mapToInt(edge -> edge.size()).max().getAsInt();

            Set<Integer> colorSet = new HashSet<>();
            for (int k = 1; k <= K; k++) {
                colorSet.add(k);
            }

            boolean[] flag = new boolean[N];
            //List<Integer>[] colors = new List[N];
            Set<Integer>[] colors = new Set[N];
            Map<Integer, Integer>[] colorMap = new Map[N];
            for (int i = 0; i < N; i++) {
                //colors[i] = new ArrayList<>(K);
                colors[i] = new HashSet<>(colorSet);
                colorMap[i] = new HashMap<>();
            }

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            queue.add(0);
            while (queue.size() > 0) {
                int poll = queue.pollFirst();

                List<Integer> V = edges[poll];

                for (int v : V) {
                    if (flag[v]) {
                        continue;
                    }

                    int k = colors[poll].iterator().next();

                    //                        while (colors[poll].contains(k)) {
                    //                            k++;
                    //                        }

                    //colors[poll].add(k);
                    //colors[v].add(k);
                    colors[v].remove(k);
                    colorMap[poll].put(v, k);

                    queue.add(v);
                }

                flag[poll] = true;
            }

            StringBuilder ans = new StringBuilder();
            ans.append(K).append("\n");
            for (int i = 0; i < N - 1; i++) {
                Integer c = colorMap[A[i]].get(B[i]);
                if (c == null) {
                    c = colorMap[B[i]].get(A[i]);
                }

                ans.append(c).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}

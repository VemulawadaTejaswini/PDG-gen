import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        PriorityQueue<Map.Entry<Integer, Integer>> Q = new PriorityQueue<>(
                Comparator.comparing(Map.Entry<Integer, Integer>::getValue)
                        .thenComparing(Map.Entry<Integer, Integer>::getKey).reversed());

        for (int i = 0; i < N; i++) {
            Q.add(new AbstractMap.SimpleEntry<>(in.nextInt(), in.nextInt()));
        }

        int cost = 0;
        for (int i = 1; i <= M; i++) {
            for (Iterator<Map.Entry<Integer, Integer>> iterator = Q.iterator(); iterator.hasNext(); ) {
                Map.Entry<Integer, Integer> V = iterator.next();
                Integer A = V.getKey();
                Integer B = V.getValue();

                if (i < A) {
                    continue;
                }

                cost += B;
                iterator.remove();
                break;
            }
        }

        out.println(cost);
    }
}

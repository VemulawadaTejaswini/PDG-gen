import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        NavigableMap<Integer, List<Integer>> T = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            T.computeIfAbsent(in.nextInt(), k -> new ArrayList<>())
                    .add(in.nextInt());
        }
        T.forEach((k, v) -> v.sort(Comparator.reverseOrder()));

        int cost = 0;
        for (int i = 1; i <= M; i++) {
            Optional<Map.Entry<Integer, List<Integer>>> maxE = T.tailMap(i, true).entrySet()
                    .stream()
                    .max(Comparator.comparing(e -> e.getValue().isEmpty() ? -1 : e.getValue().get(0)));

            if (maxE.isPresent()) {
                int key = maxE.get().getKey();
                List<Integer> Bs = maxE.get().getValue();

                cost += Bs.remove((int) 0);
                if (Bs.isEmpty()) {
                    T.remove(key);
                }
            }
        }

        out.println(cost);
    }
}

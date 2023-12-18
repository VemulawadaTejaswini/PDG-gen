import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        int max = 0;
        final Map<String, Integer> M = new HashMap<>();
        for (int i = 0; i < N; i++) {
            final String S = sc.next();
            if (!M.containsKey(S)) M.put(S, 0);
            M.put(S, M.get(S) + 1);
            max = Math.max(max, M.get(S));
        }

        List<String> sortedKeyList = M.keySet().stream().sorted().collect(Collectors.toList());

        for (String key : sortedKeyList) {
            if (M.get(key) == max) System.out.println(key);
        }
    }
}

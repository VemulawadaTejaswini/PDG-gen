//package atcoder;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        final int[] A = new int[N + 1];
        final Set<Integer> idx = new HashSet<>(N);
        final Map<Integer, List<Integer>> As = new HashMap<>(N);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; ++i) {
            A[i] = in.nextInt();
            max = Math.max(max, A[i]);
            if (!As.containsKey(A[i])) {
                As.put(A[i], new ArrayList<>());
            }
            As.get(A[i]).add(i);
            idx.add(i);
        }

        int i = 1;
        while (i <= N && !idx.isEmpty()) {
            int value = A[i];
            while (value <= max) {
                if (As.containsKey(value)) {
                    for (int j : As.get(value)) {
                        if (j != i) {
                            idx.remove(j);
                        }
                    }
                }
                value += A[i];
            }
            ++i;
        }

        System.out.println(idx.size());
    }
}

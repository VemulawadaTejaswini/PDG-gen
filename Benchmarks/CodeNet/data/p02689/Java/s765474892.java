import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] H = new int[N + 1];
        boolean[] results = new boolean[N + 1];
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 1 ; i <= N ; i++) {
            H[i] = scanner.nextInt();
            map.put(i, new HashSet<>());
            results[i] = true;
        }


        for (int i = 0 ; i < M ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Set<Integer> set = map.get(a);
            set.add(b);
            map.put(a, set);
        }

        int count = 0;
        for (int i = 1 ; i <= N ; i++) {
            if (results[i]) {
                Set<Integer> set = map.get(i);
                for (Integer dist : set) {
                    if (H[i] < H[dist]) {
                        results[i] = false;
                    } else {
                        results[dist] = false;
                    }
                }
                if (results[i]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
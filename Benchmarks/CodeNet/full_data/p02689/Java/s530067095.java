import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] H = new long[N];

        for(int i = 0; i < N; i++) {
            H[i] = scanner.nextLong();
        }

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Set<Integer> aList = map.getOrDefault(a, new HashSet<>());
            aList.add(b);
            map.put(a, aList);
            Set<Integer> bList = map.getOrDefault(b, new HashSet<>());
            bList.add(a);
            map.put(b, bList);
        }

        int ret = 0;
        for(int i = 1; i <= N; i++) {
            Set<Integer> list = map.getOrDefault(i, new HashSet<>());
            if(list.size() == 0) {
                ret++;
                continue;
            }
            boolean flg = true;
            for (int l : list) {
                if (H[i-1] <= H[l-1]) {
                    flg = false;
                }
            }
            if (flg) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}
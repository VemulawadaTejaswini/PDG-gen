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

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ArrayList<Integer> aList = map.getOrDefault(a, new ArrayList<>());
            aList.add(b);
            map.put(a, aList);
            ArrayList<Integer> bList = map.getOrDefault(b, new ArrayList<>());
            bList.add(a);
            map.put(b, bList);
        }

        int ret = 0;
        for (int key : map.keySet()) {
            ArrayList<Integer> list = map.get(key);
            boolean flg = true;
            for (int l : list) {
                if (H[key-1] < H[l-1]) {
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

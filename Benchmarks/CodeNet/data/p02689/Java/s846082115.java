import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();

        int[] obs = new int[n + 1];
        for (int i = 1; i < n; i++) obs[i] = in.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (map.containsKey(x)) {
                List<Integer> list = map.get(x);
                list.add(y);
                map.put(x, list);
            } else map.put(x, new ArrayList<>(y));

            if (map.containsKey(y)) {
                List<Integer> list = map.get(y);
                list.add(x);
                map.put(y, list);
            } else map.put(y, new ArrayList<>(x));
        }

        int count = 0;
        for (Integer key : map.keySet()) {
            boolean x = true;
            for (Integer nums : map.get(key)) {
                if(obs[key] > obs[nums]) {
                    x = false;
                    break;
                }
            }
            if(x) count++;
        }
        System.out.println(count);
    }
}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static Map<Integer, List<Integer>> map;
    static long ans = 0;
    static int[] keys;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), W = in.nextInt();
        map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int w = in.nextInt(), v = in.nextInt();
            List<Integer> vList = map.get(w);
            if(vList == null) {
                List<Integer> list = new ArrayList<>();
                list.add(v);
                map.put(w, list);
            } else {
                map.get(w).add(v);
            }
        }
        keys = new int[map.keySet().size()];
        int idx = 0;
        for (int key: map.keySet()) {
            keys[idx++] = key;
        }
        solve(W, 0, 0L , 0L);
        map.keySet().stream()
                .map(key -> map.get(key))
                .forEach(list -> Collections.sort(list, Collections.reverseOrder()));
        System.out.println(ans);
    }
    public static void solve(int W, int idx, long wsum, long vsum) {
        if(idx == keys.length) {
            if(wsum <= W) {
                ans = Math.max(ans, vsum);
            }
        } else {
            solve(W, idx+1, wsum, vsum);
          for(int v : map.get(keys[idx])) {
              wsum += keys[idx];
              vsum += v;
              solve(W, idx+1, wsum, vsum);
          }
        }
    }
}
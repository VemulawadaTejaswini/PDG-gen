import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] a = new int[n];
        a[0] = in.nextInt();
        for(int i = 1; i < n; i++) {
            a[i] = in.nextInt() + a[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int key: a) {
            Integer val = map.get(key);
            map.put(key, val == null ? 1 : val + 1);
        }
        int ans = 0;
        for(int key : map.keySet()) {
            Integer val = map.get(key);
            if(val > 1) {
                ans += (val * (val - 1)) / 2;
            }
        }
        System.out.println(ans);
    }
}
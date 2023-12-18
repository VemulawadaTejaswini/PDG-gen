import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (h.containsKey(a)) {
                h.put(a, h.get(a) + 1);
            } else {
                h.put(a, 1);
            }
        }
        sc.close();
        List<Integer> s = h.keySet().stream().collect(Collectors.toList());
        s.sort(Comparator.reverseOrder());
        int ans = 0, i = 0;
        for (int v : s) {
            i++;
            if (i > k) {
                ans += v;
            }
        }
        System.out.println(ans);
    }
}
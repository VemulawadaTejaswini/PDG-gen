import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Map<Integer, Integer> h = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (h.containsKey(a[i])) {
                h.put(a[i], h.get(a[i]) + 1);
            } else {
                h.put(a[i], 1);
            }
        }
        List<Integer> s = h.entrySet().stream().filter(x -> x.getValue() >= 4).map(x -> x.getKey())
                .collect(Collectors.toList());
        List<Integer> t = h.entrySet().stream().filter(x -> x.getValue() >= 2).map(x -> x.getKey())
                .collect(Collectors.toList());
        long ans = 0;
        if (s.size() > 0) {
            ans = (long) s.get(0) * s.get(0);
        }
        if (t.size() > 1) {
            ans = Math.max(ans, (long) t.get(0) * t.get(1));
        }
        System.out.println(ans);
    }
}
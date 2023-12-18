import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        HashMap<Long, Long> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            if (h.containsKey(a)) {
                h.put(a, h.get(a) + 1);
            } else {
                h.put(a, 1L);
            }
        }
        sc.close();
        h.entrySet().stream().sorted(Map.Entry.comparingByValue());
        long ans = 0, i = 0;
        for (long v : h.values()) {
            i++;
            if (i > k) {
                ans += v;
            }
        }
        System.out.println(ans);
    }
}
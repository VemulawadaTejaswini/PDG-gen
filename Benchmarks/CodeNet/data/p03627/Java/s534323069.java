import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Map<Integer, Integer> h = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (h.containsKey(a[i])) {
                h.put(a[i], h.get(a[i]) + 1);
            } else {
                h.put(a[i], 1);
            }
        }
        long max4 = 0;
        long max21 = 0;
        long max22 = 0;
        for (int k : h.keySet()) {
            if (h.get(k) >= 4) {
                max4 = (max4 < k) ? k : max4;
            }
            if (h.get(k) >= 2) {
                if (max21 < k) {
                    max22 = max21;
                    max21 = k;
                } else if (max22 < k) {
                    max22 = k;
                }
            }
        }
        long ans = (max4 * max4 > max21 * max22) ? max4 * max4 : max21 * max22;
        System.out.println(ans);
    }
}
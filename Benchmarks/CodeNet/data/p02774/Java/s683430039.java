import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int[] d = Arrays.stream(a).filter(i -> i > 0).sorted().toArray();
        int[] e = Arrays.stream(a).filter(i -> i < 0).sorted().toArray();
        int d1 = d.length * (d.length - 1) / 2 + e.length * (e.length - 1) / 2;
        int e1 = d.length * e.length;
        int f = n * (n - 1) / 2 - d1 - e1;

        long ans = 0;
        List<Long> g = new ArrayList<>();
        if (e1 + f < k) {
            k -= e1 + f;
            for (int i = 0; i < d.length; i++) {
                for (int j = i + 1; j < d.length; j++) {
                    g.add((long) d[i] * d[j]);
                }
            }
            for (int i = 0; i < e.length; i++) {
                for (int j = i + 1; j < e.length; j++) {
                    g.add((long) e[i] * e[j]);
                }
            }
            Collections.sort(g);
            ans = g.get(k - 1);
        } else if (k <= e1) {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < e.length; j++) {
                    g.add((long) d[i] * e[j]);
                }
            }
            Collections.sort(g);
            ans = g.get(k - 1);
        }

        System.out.println(ans);
    }
}
import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            pairs.add(new Pair(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        Collections.sort(pairs);

        int[] d = new int[n];
        int index = 0;
        long sum = 0;
        for (Pair p : pairs) {
            int b = p.b;
            int c = p.c;
            for (int j = 0; j < b; j++) {
                d[index] = c;
                sum += c;
                index++;
                if (index >= n) {
                    break;
                }
            }
            if (index >= n) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            long tmp = sum - d[n - 1 - i] + a[n - 1 - i];
            if (sum > tmp) {
                break;
            }
            sum = tmp;
        }

        System.out.println(sum);

    }

    public static class Pair implements Comparable<Pair> {
        int b;
        int c;

        public Pair(int b, int c) {
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Pair o) {
            return o.c - this.c;
        }
    }
}

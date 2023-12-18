import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        long[] a = new long[n];
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        for (int i = 0; i < m; i++) {
            list.add(new Pair(in.nextInt(), in.nextLong()));
        }
        Arrays.sort(a);
        Collections.sort(list, (p1, p2) -> p1.c - p2.c > 0 ? -1 : 1);

        int idx = 0;
        for (Pair p : list) {
            int count = 0;
            while (idx < n && count < p.b && idx + count < n && a[idx + count] < p.c) {
                a[idx + count] = p.c;
                count++;
            }
            idx += count;
        }
        System.err.println(Arrays.toString(a));
        long sum = 0;
        for (long val : a) {
            sum += val;
        }
        System.out.println(sum);
    }
}

class Pair {
    int b;
    long c;

    public Pair(int b, long c) {
        this.b = b;
        this.c = c;
    }
}
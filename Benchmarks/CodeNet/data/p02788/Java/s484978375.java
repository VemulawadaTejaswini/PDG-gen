
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long a = sc.nextLong();
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(pairs);
        Queue<Pair> pq = new LinkedList<>();
        int times = 0;
        long ans = 0;
        double max = 0;
        long lastPos = pairs.get(0).pos;
        for (int i = 0; i < n; i++) {
            Pair curr = pairs.get(i);
            if (pq.isEmpty()) {
                long newVal = curr.val - times * a;
                if (newVal > 0) {
                    Pair added = new Pair(curr.pos, newVal);
                    max = Math.max(max, newVal);
                    pq.add(added);
                }
            } else {
                Pair peek = pq.peek();
                if (curr.pos - peek.pos <= d) {
                    long newVal = (curr.pos - lastPos <= d) ? curr.val - times * a : curr.val;
                    if (newVal > 0) {
                        Pair added = new Pair(curr.pos, newVal);
                        max = Math.max(max, newVal);
                        pq.add(added);
                    }
                } else {
                    times = (int) Math.ceil(max / a);
                    ans += times;
                    lastPos = pq.poll().pos + d;
                    while (!pq.isEmpty()) {
                        pq.poll();
                    }
                    max = 0;
                    long newVal = (curr.pos - lastPos <= d) ? curr.val - times * a : curr.val;
                    if (newVal > 0) {
                        Pair added = new Pair(curr.pos, newVal);
                        max = Math.max(max, newVal);
                        pq.add(added);
                    }
                }
            }
        }
        if (!pq.isEmpty()) {
            times = (int) Math.ceil(max / a);
            ans += times;
        }
        System.out.println(ans);
    }


    public static int log2(long x) {
        return (int) (Math.log(x) / Math.log(2));
    }

    static class Pair implements Comparable<Pair> {
        long pos;
        long val;

        public Pair(long pos, long val) {
            this.pos = pos;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.pos, o.pos);
        }
    }
}

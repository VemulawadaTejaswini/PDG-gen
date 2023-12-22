import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long INF = 1_000_000_000_000_000_000L;
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        ArrayList<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
        for (int i=0;i<V;i++) {
            ArrayList<int[]> add = new ArrayList<int[]>();
            edge.add(add);
        }
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int[] add = {t, d};
            edge.get(s).add(add);
        }

        long[] dist = new long[V];
        for (int i=0;i<V;i++) {
            dist[i] = INF;
        }

        PriorityQueue<long[]> q = new PriorityQueue<long[]>((o1, o2)->Long.compare(o1[1], o2[1]));
        long[] first = {r, 0};
        q.add(first);
        while (!q.isEmpty()) {
            long[] rem = q.poll();
            int index = (int)rem[0];
            long d = rem[1];

            dist[index] = Math.min(dist[index], d);
            for (int[] tmp : edge.get(index)) {
                long[] add = {tmp[0], tmp[1]+d};
                if (dist[tmp[0]]==INF) q.add(add);
            }
        }

        for (int i=0;i<V;i++) {
            if (dist[i]==INF) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }
}

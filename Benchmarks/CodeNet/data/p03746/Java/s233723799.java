import java.math.*;
import java.util.*;

public class Main {
    public static class MyPair<T1, T2> {
        T1 first;
        T2 second;

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof MyPair)) return false;
            MyPair p = (MyPair) obj;
            return first.equals(p.first) && second.equals(p.second);
        }

        MyPair(T1 first, T2 second) {
            this.first = first;
            this.second = second;
        }
    }

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        TreeMap<Integer, TreeSet<Integer>> path = new TreeMap<>();
        int a = 0, b = 0;
        for (int i = 0; i < m; i++) {
            a = input.nextInt();
            b = input.nextInt();
            if (!path.containsKey(a)) path.put(a, new TreeSet<Integer>());
            if (!path.containsKey(b)) path.put(b, new TreeSet<Integer>());
            path.get(a).add(b);
            path.get(b).add(a);
        }
        LinkedList<Integer> d = new LinkedList<>();
        d.add(a);
        d.add(b);
        int[] vis = new int[n + 1];
        vis[a] = vis[b] = 1;
        boolean updated = true;
        while (updated) {
            updated = false;
            for (int e : path.get(d.getFirst())) {
                if (vis[e] == 0) {
                    vis[e] = 1;
                    d.addFirst(e);
                    updated = true;
                    break;
                }
            }
            for (int e : path.get(d.getLast())) {
                if (vis[e] == 0) {
                    vis[e] = 1;
                    d.addLast(e);
                    updated = true;
                    break;
                }
            }
        }
        System.out.println(d.size());
        for(int e:d) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}

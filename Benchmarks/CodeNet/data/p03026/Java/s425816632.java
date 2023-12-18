import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N - 1];
            int[] b = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            int[] c = new int[N];
            for (int i = 0; i < N; i++) {
                c[i] = in.nextInt();
            }
            Arrays.sort(c);

            ArrayList<Integer>[] vs = new ArrayList[N];
            for (int i = 0; i < vs.length; i++) {
                vs[i] = new ArrayList<>();
            }
            for (int i = 0; i < N - 1; i++) {
                vs[a[i]].add(b[i]);
                vs[b[i]].add(a[i]);
            }

            ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();
            for (int i = 0; i < vs.length; i++) {
                pairs.add(new Pair<Integer, Integer>(vs[i].size(), i));
            }
            Collections.sort(pairs);

            LinkedList<Integer> queue = new LinkedList<>();
            int[] d = new int[N];
            {
                int n2 = pairs.get(pairs.size() - 1).second.intValue();
                queue.add(n2);
                d[n2] = c[N - 1];
            }
            int sum = 0;
            for (int i = 1; !queue.isEmpty();) {
                int n = queue.poll().intValue();
                for (int v : vs[n]) {
                    if (d[v] >= 1) {
                        continue;
                    }
                    queue.add(v);
                    d[v] = c[N - 1 - i];
                    sum += d[v];
                    i++;
                }
            }

            System.out.println(sum);
            for (int i = 0; i < d.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(d[i]);
            }
            System.out.println();
        }
    }
}

class Pair<T extends Comparable<T>, S> implements Comparable<Pair<T, S>> {
    public T first;
    public S second;

    public Pair(T t, S s) {
        this.first = t;
        this.second = s;
    }

    private int hash = 0;

    @Override
    public int hashCode() {
        if (hash == 0) {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((first == null) ? 0 : first.hashCode());
            result = prime * result + ((second == null) ? 0 : second.hashCode());
            hash = result;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair<T, S> other = (Pair<T, S>) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        } else if (!first.equals(other.first))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        } else if (!second.equals(other.second))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, S> o) {
        return first.compareTo(o.first);
    }
}

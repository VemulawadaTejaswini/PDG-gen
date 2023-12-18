import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] u = new int[N];
            int[] v = new int[N];
            int[] w = new int[N];
            for (int i = 0; i < N - 1; i++) {
                u[i] = in.nextInt() - 1;
                v[i] = in.nextInt() - 1;
                w[i] = in.nextInt();
            }

            ArrayList<Pair<Integer, Integer>>[] vAndDists = new ArrayList[N];
            for (int i = 0; i < vAndDists.length; i++) {
                vAndDists[i] = new ArrayList<>();
            }
            for (int i = 0; i < N; i++) {
                vAndDists[u[i]].add(new Pair<Integer, Integer>(v[i], w[i]));
                vAndDists[v[i]].add(new Pair<Integer, Integer>(u[i], w[i]));
            }

            LinkedList<Pair<Integer, Integer>> queue = new LinkedList<>();
            int[] dist = new int[N];
            Arrays.fill(dist, -1);
            {
                queue.add(new Pair<Integer, Integer>(0, 0));
                dist[0] = 0;
            }
            for (; !queue.isEmpty();) {
                Pair<Integer, Integer> current = queue.poll();
                int currentV = current.first.intValue();
                int currentDist = current.second.intValue();
                for (Pair<Integer, Integer> vAndDist : vAndDists[currentV]) {
                    int nextV = vAndDist.first.intValue();
                    if (dist[nextV] != -1) {
                        continue;
                    }
                    int nextDist = currentDist + vAndDist.second.intValue();
                    queue.add(new Pair<Integer, Integer>(nextV, nextDist));
                    dist[nextV] = nextDist;
                }
            }

            for (int i = 0; i < N; i++) {
                System.out.println(dist[i] & 1);
            }
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

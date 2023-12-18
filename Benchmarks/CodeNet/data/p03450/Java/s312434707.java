import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int inf = (int) 1e9;

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            int[] L = new int[M];
            int[] R = new int[M];
            int[] D = new int[M];
            for (int i = 0; i < M; i++) {
                L[i] = in.nextInt() - 1;
                R[i] = in.nextInt() - 1;
                D[i] = in.nextInt();
            }

            ArrayList<Pair<Integer, Integer>>[] edges = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new ArrayList<Pair<Integer, Integer>>();
            }

            for (int i = 0; i < M; i++) {
                edges[L[i]].add(new Pair<Integer, Integer>(R[i], D[i]));
                edges[R[i]].add(new Pair<Integer, Integer>(L[i], -D[i]));
            }

            boolean res = true;

            int[] x = new int[N];
            Arrays.fill(x, -inf);
            for (int i = 0; i < N; i++) {
                if (x[i] == -inf) {
                    x[i] = 0;
                    res &= dfs(i, x, edges);
                }
            }

            System.out.println(res ? "Yes" : "No");
        }
    }

    private static boolean dfs(int i, int[] x, ArrayList<Pair<Integer, Integer>>[] edges) {

        for (int j = 0; j < edges[i].size(); j++) {
            int i2 = edges[i].get(j).first.intValue();
            int D = edges[i].get(j).second.intValue();
            if (x[i2] == -inf) {
                x[i2] = x[i] + D;
                boolean dfs = dfs(i2, x, edges);
                if (!dfs) {
                    return false;
                }
            } else {
                if (x[i] + D == x[i2]) {

                } else {
                    return false;
                }
            }

        }
        return true;
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

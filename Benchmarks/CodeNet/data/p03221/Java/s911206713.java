import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] P = new int[M];
            int[] Y = new int[M];
            for (int i = 0; i < M; i++) {
                P[i] = in.nextInt();
                Y[i] = in.nextInt();
            }

            ArrayList<Pair<Integer, Integer>> ps = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                ps.add(new Pair<Integer, Integer>(Y[i], i));
            }
            Collections.sort(ps);

            int[] index = new int[M];
            int[] count = new int[N + 1];
            for (int m = 0; m < M; m++) {
                int i = ps.get(m).second.intValue();
                index[i] = ++count[P[i]];
            }

            for (int i = 0; i < M; i++) {
                System.out.println(String.format("%06d%06d", P[i], index[i]));
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

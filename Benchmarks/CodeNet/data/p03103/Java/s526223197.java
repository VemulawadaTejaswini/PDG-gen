import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            long[] A = new long[N];
            long[] B = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
            }

            ArrayList<Pair<Long, Integer>> pairs = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                pairs.add(new Pair<Long, Integer>(A[i], i));
            }
            Collections.sort(pairs);

            long money = 0;
            long count = 0;
            for (int i = 0; i < N; i++) {
                int j = pairs.get(i).second.intValue();
                if (count + B[j] <= M) {
                    money += A[j] * B[j];
                    count += B[j];
                } else {
                    money += A[j] * (M - count);
                    count += M - count;
                }
            }

            System.out.println(money);
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

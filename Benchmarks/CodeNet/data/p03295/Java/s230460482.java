import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                pairs.add(new Pair<Integer, Integer>(in.nextInt(), in.nextInt()));
            }

            ArrayList<Pair<Integer, Integer>> pairs2 = new ArrayList<>();
            pairs2.add(pairs.get(0));

            iLoop: for (int i = 1; i < M; i++) {
                for (int j = 0; j < pairs2.size(); j++) {
                    if (intersect(pairs2.get(j), pairs.get(i))) {
                        pairs2.get(j).first = Math.max(pairs2.get(j).first, pairs.get(i).first);
                        pairs2.get(j).second = Math.min(pairs2.get(j).second, pairs.get(i).second);
                        continue iLoop;
                    }
                }
                pairs2.add(pairs.get(i));
            }
            System.out.println(pairs2.size());
        }
    }

    private static boolean intersect(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2) {
        return pair.second > pair2.first;
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

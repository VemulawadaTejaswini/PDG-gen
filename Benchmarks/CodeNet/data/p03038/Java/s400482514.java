import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int[] B = new int[M];
            int[] C = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = in.nextInt();
                C[i] = in.nextInt();
            }

            ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                pairs.add(new Pair<Integer, Integer>(C[i], B[i]));
            }
            Collections.sort(pairs);

            int[] AA = new int[N];
            iLoop: for (int i = 0, j = 0; i < pairs.size(); i++) {
                Pair<Integer, Integer> pair = pairs.get(pairs.size() - 1 - i);
                int c = pair.first.intValue();
                int b = pair.second.intValue();
                for (int k = 0; k < b; k++) {
                    AA[j++] = c;
                    if (j >= N) {
                        break iLoop;
                    }
                }
            }

            Arrays.sort(A);
            Arrays.sort(AA);

            for (int i = 0, j = 0; i < N; i++) {
                if (A[N - 1 - j] > AA[i]) {
                    AA[i] = A[N - 1 - j];
                    j++;
                }
            }

            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += AA[i];
            }
            System.out.println(sum);
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

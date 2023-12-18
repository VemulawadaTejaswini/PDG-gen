import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static class Input {
        private int[] t;
        private int[] d;
        private int n;
        private int k;

        public Input(int n, int k, int[] t, int[] d)
        {
            this.n = n;
            this.k = k;
            this.t = t;
            this.d = d;
        }

        public int[] getT() {
            return t;
        }
        public int[] getD() {
            return d;
        }
        public int getN() {
            return n;
        }
        public int getK() {
            return k;
        }
    }

    public static void main(String[] args) {
	    Input input = getInput();
        int n = input.getN();
        int k = input.getK();
        int[] t = input.getT();
        int[] d = input.getD();

        Set<Integer> idx = new HashSet<>();
        for (int i = 0; i < n; i++) {
            idx.add(i);
        }
        long max = 0;
        for (Set<Integer> choice: combination(idx, k))
        {
            Set<Integer> kind = new HashSet<>();
            long score = 0;
            for (int i: choice) {
                score += d[i];
                kind.add(t[i]);
            }
            score += kind.size() * kind.size();
            if (score > max) {
                max = score;
            }
        }
        System.out.println(max);
        return;
    }


    private static Input getInput()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] pair = br.readLine().split("\\s");
            int n = Integer.parseInt(pair[0]);
            int k = Integer.parseInt(pair[1]);
            int[] t = new int[n];
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                pair = br.readLine().split("\\s");
                t[i] = Integer.parseInt(pair[0]);
                d[i] = Integer.parseInt(pair[1]);
            }
            return new Input(n, k, t, d);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private enum Operation {add, remove};
    private static<T> Set<T> apply(Set<T> src, Operation operation, T item) {
        Set<T> result = new HashSet<T>(src);
        if (Operation.add == operation) result.add(item);
        if (Operation.remove == operation) result.remove(item);
        return result;
    }

    private static<T> Set<Set<T>> _combination(Set<T> selected, int depth, Set<T> pool) {
        if (depth == 0) return apply(new HashSet<>(), Operation.add, selected);
        Set<Set<T>> result = new HashSet<Set<T>>();
        for (T item : pool) {
            result.addAll(
                    _combination(
                            apply(selected, Operation.add, item), // item を選択済みに変更
                            depth - 1,
                            apply(pool, Operation.remove, item)  // pool の中からは取り除く
                    )
            );
        }
        return result;
    }
    public static<T> Set<Set<T>> combination(Set<T> src, int k) {
        return _combination(new HashSet<T>(), k, src);
    }


}

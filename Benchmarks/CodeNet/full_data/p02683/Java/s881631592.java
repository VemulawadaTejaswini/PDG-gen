import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        List<Integer[]> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] array = new Integer[m + 1];
            array[0] = Integer.parseInt(sc.next());
            for (int j = 1; j <= m; j++) {
                array[j] = Integer.parseInt(sc.next());
            }
            a.add(array);
        }
        sc.close();

        // 主処理
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }

        List<Set<Integer>> comblist = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            comblist.addAll(combination(set, i));
        }

        int min = Integer.MAX_VALUE;
        for (Set<Integer> combset : comblist) {
            List<Integer> list = new ArrayList<>(combset);
            int amount = 0;
            int[] score = new int[m];
            for (int index : list) {
                amount += a.get(index)[0];
                for (int i = 0; i < m; i++) {
                    score[i] += a.get(index)[i + 1];
                }
            }
            int len = Arrays.stream(score).filter(i -> x <= i).toArray().length;
            if (len == m) {
                min = Math.min(min, amount);
            }
        }

        boolean judge = min != Integer.MAX_VALUE;
        int result = judge ? min : -1;

        // 出力
        System.out.println(result);
    }

    public static <T> Set<Set<T>> combination(Set<T> src, int k) {
        if (src.size() <= k) {
            Set<Set<T>> set = new HashSet<>();
            set.add(src);
            return set;
        } else {
            return _combination(new HashSet<T>(), k, src);
        }
    }

    private static <T> Set<Set<T>> _combination(Set<T> selected, int depth, Set<T> pool) {
        if (depth == 0)
            return apply(new HashSet<>(), Operation.add, selected); // 選択済みのもののみ要素に持つ集合をかえす
        Set<Set<T>> result = new HashSet<Set<T>>();
        for (T item : pool) {
            result.addAll(_combination(apply(selected, Operation.add, item), // item を選択済みに変更
                    depth - 1, apply(pool, Operation.remove, item) // pool の中からは取り除く
            ));
        }
        return result;
    }

    private static <T> Set<T> apply(Set<T> src, Operation operation, T item) {
        Set<T> result = new HashSet<T>(src);
        if (Operation.add == operation)
            result.add(item);
        if (Operation.remove == operation)
            result.remove(item);
        return result;
    }

    private enum Operation {
        add, remove
    };
}

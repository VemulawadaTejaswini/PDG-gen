import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Set<Integer> numset = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numset.add(i);
        }
        Set<Set<Integer>> set = combination(numset, 2);

        int result = 0;
        for (Set<Integer> s : set) {
            List<Integer> numlist = new ArrayList<>(s);
            int h = a[numlist.get(0)] + a[numlist.get(1)];
            int diff = Math.abs((numlist.get(0) + 1) - (numlist.get(1) + 1));
            if (h == diff) {
                result++;
            }
        }

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

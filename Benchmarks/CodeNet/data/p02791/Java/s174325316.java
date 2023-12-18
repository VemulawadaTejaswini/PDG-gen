import java.util.*;

public class Main {
    private static class K {
        public int i;
        public int prev;

        public K(int i, int prev) {
            this.i = i;
            this.prev = prev;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            K k = (K) o;
            return i == k.i &&
                    prev == k.prev;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, prev);
        }
    }

    private static Map<K, Integer> memo = new HashMap<>();

    public static int lds(List<Integer> nums, int i, int n, int prev) {
        K key = new K(i, prev);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (i == n) {
            return 0;
        }
        int excl = lds(nums, i + 1, n, prev);
        int incl = 0;
        if (nums.get(i) < prev) {
            incl = 1 + lds(nums, i + 1, n, nums.get(i));
        }

        memo.put(key, Integer.max(incl, excl));
        return memo.get(key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(lds(nums, 0, nums.size(), Integer.MAX_VALUE));
    }

}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private class CacheEntry {
        public int target;
        public int startIdx;
        public int endIdx;

        public CacheEntry (int t, int s, int e) {
            target = t;
            startIdx = s;
            endIdx = e;
        }

        @Override
        public boolean equals(Object that) {
            if (!(that instanceof CacheEntry)) {
                return false;
            }
            CacheEntry thatCache = (CacheEntry) that;
            return (target == thatCache.target) &&
                    (startIdx == thatCache.startIdx) &&
                    (endIdx == thatCache.endIdx);
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(target) * Integer.hashCode(startIdx) * Integer.hashCode(endIdx);
        }
    }

    private Map<CacheEntry, Long> cache = new HashMap<>();

    public long waysForSum(int target, int[] elems, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            if (target == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }

        long result = 0;
        CacheEntry cacheKey = new CacheEntry(target, startIdx, endIdx);
        if (cache.containsKey(cacheKey)) {
            result = cache.get(cacheKey);
        }
        else {
            result += waysForSum(target + elems[startIdx], elems, startIdx + 1, endIdx);
            result += waysForSum(target, elems, startIdx + 1, endIdx);
            cache.put(cacheKey, result);
        }
        return result;
    }

    private void solve(int n, int a, int[] cards) {
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[i] = cards[i] - a;
        }
        System.out.println(waysForSum(0, diffs, 0, n - 1) - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        Main main = new Main();
        main.solve(n, a, cards);
    }
}

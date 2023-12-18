import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println( solve(N) );
    }

    private static int solve(long N) {
        return rec(N, N, new HashMap<>());
    }

    private static int rec(long X, long S, Map<Key, Integer> memo) {
        Key key = new Key(X, S);
        if( memo.containsKey(key) ) {
            return memo.get(key);
        } else {
            int ans = calc(X, S, memo);
            memo.put(key, ans);
            return ans;
        }
    }

    private static int calc(long X, long S, Map<Key, Integer> memo) {
        if( S == 0 ) return 1; // (a, b) = (0, 0)

        // こういう写像感のある漸化式、なんと呼ぶのか

        // even_even(a=2a', b=2b')
        // a + b = 2a' + 2b' <= S
        // a' + b' <= S/2
        // a ^ b = 2a' ^ 2b' <= X
        // a' ^ b' <= X/2
        int even_even = rec(X/2, S/2, memo);

        // odd_even(a=2a'+1, b=2b')
        // a + b = 2a'+1 + 2b' <= S
        // a' + b' <= (S-1)/2
        // a ^ b = (2a'+1) ^ 2b' <= X
        // a' ^ b' <= (X-1)/2
        int odd_even = rec((X-1)/2, (S-1)/2, memo);

        // odd_odd(a=2a'+1, b=2b'+1)
        // a + b = 2a'+1 + 2b'+1 <= S
        // a'+ b' <= (S-2)/2
        // a ^ b = (2a'+1) ^ (2b'+1) <= X
        // a' ^ b' <= 2/X
        int odd_odd;
        if( S >= 2 ) {
            odd_odd = rec(X/2, (S-2)/2, memo);
        } else {
            odd_odd = 0;
        }

        return (int)(((long)even_even + odd_even + odd_odd)% MOD);
    }

    private static class Key {
        private final long x;
        private final long s;

        public Key(long x, long s) {
            this.x = x;
            this.s = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return x == key.x &&
                    s == key.s;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, s);
        }
    }
}
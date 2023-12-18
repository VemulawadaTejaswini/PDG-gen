import java.util.*;

public class Main {

    static class Pair<U, V>
    {
        public final U first;   	// first field of a Pair
        public final V second;  	// second field of a Pair

        // Constructs a new Pair with specified values
        public Pair(U first, V second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        // Checks specified object is "equal to" current object or not
        public boolean equals(Object o)
        {
            if (this == o)
                return true;

            if (o == null || getClass() != o.getClass())
                return false;

            lib.others.Pair<?, ?> pair = (lib.others.Pair<?, ?>) o;

            // call equals() method of the underlying objects
            if (!first.equals(pair.first))
                return false;
            return second.equals(pair.second);
        }

        @Override
        // Computes hash code for an object to support hash tables
        public int hashCode()
        {
            // use hash codes of the underlying objects
            return 31 * first.hashCode() + second.hashCode();
        }

        @Override
        public String toString()
        {
            return "(" + first + ", " + second + ")";
        }

        // Factory method for creating a Typed Pair immutable instance
        public static <U, V> lib.others.Pair<U, V> of(U a, V b)
        {
            // calls private constructor
            return new lib.others.Pair<>(a, b);
        }
    }

    static class BitManipulations {

        // Sets the i'th bit to 1
        public static int setBit(int set, int i) {
            return set | (1 << i);
        }

        // Checks if the i'th is set
        public static boolean isSet(int set, int i) {
            return (set & (1 << i)) != 0;
        }

        // Sets the i'th bit to zero
        public static int clearBit(int set, int i) {
            return set & ~(1 << i);
        }

        // Toggles the i'th bit from 0 -> 1 or 1 -> 0
        public static int toggleBit(int set, int i) {
            return set ^ (1 << i);
        }

        // Returns a number with the first n bits set to 1
        public static int setAll(int n) {
            return (1 << n) - 1;
        }

        // Verifies if a number n is a power of two
        public static boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }

        // Count number of 1's
        public static int countSetBits(int n) {
            int count = 0;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Pair<Integer, Integer>>> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) arr.add(new ArrayList<>());
        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            for (int j = 0; j < a; ++j) {
                arr.get(i).add(new Pair<>(sc.nextInt(), sc.nextInt()));
            }
        }

        int tmp = 0;
        int ans = 0;
        for (int bit = 0; bit < (1 << n); ++bit) {
            boolean flag = true;

            for (int i = 0; i < n; ++i) {

                if (!BitManipulations.isSet(bit, i)) continue;

                for (Pair<Integer, Integer> pair : arr.get(i)) {
                    if (pair.second == 1) {
                        if (!BitManipulations.isSet(bit, pair.first - 1)) flag = false;
                    } else {
                        if (BitManipulations.isSet(bit, pair.first - 1)) flag = false;
                    }
                }
            }

            if (flag) {
                tmp = BitManipulations.countSetBits(bit);
                ans = Math.max(ans, tmp);
            }
        }

        System.out.println(ans);
    }
}
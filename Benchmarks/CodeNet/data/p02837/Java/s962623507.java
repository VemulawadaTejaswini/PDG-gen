import java.util.*;

public class Main {

    private static class BitManipulations {

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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = (int)1e9 + 7;//(int)Math.pow(10, 9) + 7;
    private static final long EIGHT = (long) 1e18;
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        if (n == 0) {
            print(""+x);
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            int inp = sc.nextInt();
            set.add(inp);
        }

        int res = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = -100; i <= 100; i++) {
            if (!set.contains(i)) {
                int dist = Math.abs(i - x);
                if (res > dist) {
                    res = dist;
                    idx = i;
                }
            }
        }
        print(""+idx);
        System.exit(0);
    }

    /*
     * Check if a * b is overflow or not
     */
    static Boolean isOverflowByMul(long a, long b) {
        if (a == 0 || b == 0) {
            return false;
        }

        long result = a * b;
        if (a == result / b) {
            return false;
        }
        return true;
    }
    static private long powMod(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            n >>= 1;
            a = a * a % mod;
        }
        return res;
    }
    static private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

    static  private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    static private boolean findNextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        int last = nums.length - 2;

        while (last >= 0) {
            if (nums[last] < nums[last + 1]){
                break;
            }
            last--;
        }

        if (last < 0) { return false; }
        int nextGenerater = nums.length - 1;

        for (int i = nums.length - 1; i > last; i--) {
            if (nums[i] > nums[last]) {
                nextGenerater = i;
                break;
            }
        }

        swap(nums, nextGenerater, last);
        reverse(nums, last + 1, nums.length - 1);
        return true;
    }

    static private int[] generateNArray(int n) {
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = i + 1;
        }

        return res;
    }

    static  private void print(String s) {
        System.out.println(s);
    }

    static private void printArray(int[] e) {
        for (int s: e) {
            System.out.print(s + " ");
        }
        print("");
    }

    static private int log2(int x) {
        return (int)(Math.log(x) / Math.log(2));
    }

    static private long gcd(long m, long n) {
        if (m < n) { return gcd(n, m); }
        if (m % n == 0) { return n; }
        return gcd(n, m%n);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

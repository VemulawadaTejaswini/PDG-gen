import java.io.*;
import java.util.*;

public class Main {
    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        long[] nx = in.readLineAsLongArray();
        final int N = (int) nx[0];
        long X = nx[1];
        long[] S = in.readLineAsLongArray();
        HashSet<Long> set = new HashSet<>();
        for (long l : S) {
            set.add(l);
        }
        System.out.println(countNumbers(set, X));
    }

    private long countNumbers(Set<Long> set, long x) {
        long count = 0L;
        if (x == 0) {
            return count;
        } else if (set.size() == 1) {
            for (Long l : set) {
                count += x % l;
            }
            return count;
        }
        int small = 0;
        int large = 0;
//        for (int i = 0; i < set.length; i++) {
        HashSet<Long> subSet = new HashSet<>();
        for (long l : set) {
            if (l == 1 || l == x) {
                return 0L;
            }
            if (l < x) {
                small++;
                subSet.add(l);
            }
            if (l > x) {
                large++;
            }
        }

        if (large > 0) {
            count = x;
            for (int i = 1; i <= large; i++) {
                count = (count * i) % MOD;
            }
        }

//        for (int i = 0; i < small; i++) {
        Set<Long> ss = new HashSet<>(subSet);
        for (long l : subSet) {
            long r = x % l;
            ss.remove(l);
            if (r > 0) {
                count = (count + countNumbers(ss, r) % MOD);
            }
            ss.add(l);
        }
        return count % MOD;
    }

    private long[] copyAndRemove(long[] arr, int start, int end, int removeIndex) {
        long[] copyArray = new long[end - start - 1];
        int j = 0;
        for (int i = start; i < end; i++) {
            if (i == removeIndex) {
                continue;
            }
            copyArray[j++] = arr[i];
        }
        return copyArray;
    }

    static class CustomReader extends BufferedReader {

        //private static final int DEFAULT_BUF_SIZE = 2048;
        // private static final int DEFAULT_BUF_SIZE = 4096;
        private static final int DEFAULT_BUF_SIZE = 8192;
        //private static final int DEFAULT_BUF_SIZE = 16384;
        // private static final int DEFAULT_BUF_SIZE = 1048576;

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in), DEFAULT_BUF_SIZE);
        }

        public int readLineAsInt() throws IOException {
            return Integer.parseInt(readLine());
        }

        public long[] readLineAsLongArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            long[] intArray = new long[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Long.parseLong(strArray[i]);
            }
            return intArray;
        }

    }
}
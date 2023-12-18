import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt();
        int[] nums = new int[N];
        long[] occurrences = new long[N + 1];
        long[] includeAll = new long[N + 1];
        long[] excludeOne = new long[N + 1];

        for (int i = 0; i < N; i++) {
            nums[i] = nextInt();
            occurrences[nums[i]]++;
        }

        for (int i = 0; i < occurrences.length; i++) {
            includeAll[i] = chooseN2(occurrences[i]);
            if (occurrences[i] > 0) excludeOne[i] = chooseN2(occurrences[i] - 1);
        }

        long sumIncludeAll = Arrays.stream(includeAll).sum();

        for (int num : nums) {
            System.out.println(sumIncludeAll - includeAll[num] + excludeOne[num]);
        }
    }

    private static long chooseN2(long n) {
        return (n * (n - 1))/2;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}

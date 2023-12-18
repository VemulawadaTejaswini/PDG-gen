import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        init(System.in);
        int k = nextInt();
        ArrayList<Long> nums = new ArrayList<>();
        if (k <= 9) {
            for (int i = 1; i <= k; i++) {
                nums.add((long)i);
            }
        }
        else {
            for (int i = 1; i <= 9; i++) nums.add((long) i);
            k -= 9;
            for (int i = 0; i < k; i++) {
                nums.add(nums.get(nums.size() - 1) + 10);
            }
        }

        for (long num: nums) System.out.println(num);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
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

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}
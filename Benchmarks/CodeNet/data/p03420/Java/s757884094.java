import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderD.init(System.in);
        int n = ReaderD.nextInt();
        int k = ReaderD.nextInt();

        long ans = 0;
//        long[] dp = new long[n + 1];
//        for (int i = k + 1; i <= n; i++) {
//            int ik = i - 1;
//            if (ik == 0) dp[ik] = n/i - 1;
//            else {
//                dp[ik] += n/ik;
//                for (int j = 2*ik; j <= n; j += ik) dp[j] -= dp[ik];
//                dp[ik] += dp[ik - 1];
//            }
//            ans += dp[ik];
//        }

        int upto = n % 2 == 0 ? n/2 - 1 : n/2;
        for (int i = k; i <= upto; i++) {
//            StringBuilder nums = new StringBuilder();
////            int add = 0;
            for (int j = i + 1; j <= n; j++) {
                int num = (n - i)/j;
//                nums.append(num + 1).append(" ");
//                add += (num + 1);
                ans += num + 1;
            }
//            System.out.println(i + ": " + nums.toString() + " " + add);
        }

        long min = Math.min(n - k, n - (long)Math.ceil((n*1.0)/2));
        ans += (min*(min + 1))/2;
        if (k == 0) ans -= n;
        System.out.println(ans);
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderD {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    //    Get a whole line.
    static String line() throws IOException {
        return reader.readLine();
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}


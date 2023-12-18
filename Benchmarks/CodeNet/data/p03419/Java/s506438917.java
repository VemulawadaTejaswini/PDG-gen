import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderC.init(System.in);
        long n = ReaderC.nextLong();
        long m = ReaderC.nextLong();
        if (m == 1 && n == 1) System.out.println(1);
        else if (m == 1) System.out.println(n - 2);
        else if (n == 1) System.out.println(m - 2);
        else System.out.println((m - 2)*(n - 2));
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderC {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
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

//    static int nextInt() throws IOException {
//        return Integer.parseInt(next());
//    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

//    //    Get a whole line.
//    static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}


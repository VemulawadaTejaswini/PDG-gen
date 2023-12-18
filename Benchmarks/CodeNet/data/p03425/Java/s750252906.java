import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderC.init(System.in);
        int n = ReaderC.nextInt();
        long m = 0, a = 0, r = 0, c = 0, h = 0;
        for (int i = 0; i < n; i++) {
            String name = ReaderC.next();
            if (name.charAt(0) == 'M') m++;
            else if (name.charAt(0) == 'A') a++;
            else if (name.charAt(0) == 'R') r++;
            else if (name.charAt(0) == 'C') c++;
            else if (name.charAt(0) == 'H') h++;
        }

        long ans = m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h + a*r*c + a*r*h + a*c*h + r*c*h;
        System.out.println(ans);
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


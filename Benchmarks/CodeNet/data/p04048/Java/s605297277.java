import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()){tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
    public static void main(String []args) throws IOException {
        init(System.in);
        long n = nextInt();
        long x = nextInt();
        if (x*2 == n) {
            System.out.println(x + x + x);
        } else {
            System.out.println(x + (n - x) + x + x + (n - 2 * x) * 3);
        }
    }
}
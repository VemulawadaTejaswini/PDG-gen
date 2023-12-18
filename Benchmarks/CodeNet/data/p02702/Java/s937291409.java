import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            //  int []a = {2019,4038,6057,8076,10095,12114,14133,16152,18171,20190,22209,24228,26247,28266,30285,32304,34323,36342,38361,40380,42399,44418,46437,48456,50475,52494,54513,56532,58551,60570,62589,64608,66627,68646,70665,72684,74703,76722,78741,80760,82779,84798,86817,88836,90855,92874,94893,96912,98931};
            long count = 0;
            for (int i = 0; i < s.length(); i++) {
                String k = "";
                for (int j = i; j < Math.min(128, s.length()); j++) {
                    k += s.charAt(j);
                    BigInteger g = new BigInteger(k);
                    if (g.mod(BigInteger.valueOf(2019)).equals(BigInteger.valueOf(0))) count++;
                }

            }

            out.println(count);

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}


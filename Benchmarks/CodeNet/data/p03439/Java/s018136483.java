import javax.sound.midi.Soundbank;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author rizhiy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        PrintWriter out;
        InputReader in;
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            this.out = out;
            this.in = in;
            int l = 0;
            int r = n-1;
            System.out.println(r);
            System.out.flush();
            String pls = in.next();
            if (pls.equals("Vacant")) return;
            System.out.println(l);
            System.out.flush();
            pls = in.next();
            if (pls.equals("Vacant")) return;
            while (l < r){
                System.out.println((l+r)/2);
                System.out.flush();
                String s = in.next();
                if (s.equals("Vacant")) break;
                if (((l+r)/2 - l) % 2 == 0){
                    if (pls.equals(s)){
                        l = (l + r) /2 ;
                        pls = s;
                    } else {
                        r = (l + r) /2 ;
                    }
                } else {
                    if (pls.equals(s)){
                        r = (l + r) /2 ;
                    } else {
                        l = (l + r) /2 ;
                        pls = s;
                    }
                }
            }

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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
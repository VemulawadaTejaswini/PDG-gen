import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */

public class Main {
    public static void main(String[] args) {
        InputStream    inputStream    = System.in;
        OutputStream outputStream = System.out;
        InputReader    in                      = new InputReader(inputStream);
        PrintWriter      out                    = new PrintWriter(outputStream);
        Task                 solver               = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        	int ABCD = in.nextInt();
        	int a = ABCD / 1000;
        	int b = (ABCD / 100) % 10;
        	int c = (ABCD / 10) % 10;
        	int d = ABCD % 10;
        	String ans = "";
        	
        	if(a + b + c + d == 7) {ans = a + "+" + b + "+" + c + "+" + d;}
        	if(a + b + c - d == 7) {ans = a + "+" + b + "+" + c + "-" + d;}
        	if(a + b  - c + d == 7) {ans = a + "+" + b + "-" + c + "+" + d;}
        	if(a - b + c + d == 7) {ans = a + "-" + b + "+" + c + "+" + d;}
        	if(a - b - c - d == 7) {ans = a + "-" + b + "-" + c + "-" + d;}
        	if(a - b - c + d == 7) {ans = a + "-" + b + "-" + c + "+" + d;}
        	if(a - b + c - d == 7) {ans = a + "-" + b + "+" + c + "-" + d;}
        	if(a + b - c - d == 7) {ans = a + "+" + b + "-" + c + "-" + d;}
        	
        	out.println(ans + "=7");
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


import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputReader cin = new InputReader(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        TaskA taskA = new TaskA();
        taskA.run(cin, cout);

        cout.close();
    }
}

class TaskA {
    void run(InputReader cin, PrintWriter cout) {
        int a = cin.nextInt();
        int b = cin.nextInt();

        String result;
        final String ZERO = "Zero";
        final String POS = "Positive";
        final String NEG = "Negative";

        if (a == 0 || b == 0) {
            result = ZERO;
        } else if (a < 0 && 0 < b) {
            result = ZERO;
        } else if (a < 0 && b < 0) {
            if ((b - a) % 2 == 0) {
                result = NEG;
            } else {
                result = POS;
            }
        } else { // 0 < a && 0 < b
            result = POS;
        }

        cout.println(result);
    }
}

class InputReader {
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
        return Integer.parseInt(this.next());
    }
}
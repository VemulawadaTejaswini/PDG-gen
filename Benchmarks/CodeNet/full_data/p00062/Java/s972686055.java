import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            int s = 0;
            for (int i = 0; i < 10; i++) {
                s += (line.charAt(i) - '0') * cs[i];
            }
            out.println(s % 10);
        }
    }

    private static final int[] cs = { 1, 9, 36, 84, 126, 126, 84, 36, 9, 1 };
}
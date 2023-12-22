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
        String line = null;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            int d = Integer.parseInt(line);
            int s = 0;
            for (int x = 0; x < 600; x += d) {
                s += x * x * d;
            }
            out.println(s);
        }
    }
}
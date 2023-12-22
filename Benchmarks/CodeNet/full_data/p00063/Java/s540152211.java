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
        int result = 0;
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            int len = line.length();
            boolean different = false;
            for (int i = 0; i < len / 2; i++) {
                if (line.charAt(i) != line.charAt(len - i - 1)) {
                    different = true;
                    break;
                }
            }
            if (!different) {
                result++;
            }
        }
        out.println(result);
    }
}
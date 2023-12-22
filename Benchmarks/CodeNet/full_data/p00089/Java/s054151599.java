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
        int[] results = new int[50];
        int lastLength = 0;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(",");
            if (values.length > lastLength) {
                for (int i = values.length - 1; i >= 0; i--) {
                    int left = i > 0 ? results[i - 1] : 0;
                    int top = results[i];
                    results[i] = Math.max(left, top)
                            + Integer.parseInt(values[i]);
                }
            } else {
                for (int i = 0; i < values.length; i++) {
                    int top = results[i];
                    int right = results[i + 1];
                    results[i] = Math.max(top, right)
                            + Integer.parseInt(values[i]);
                }
            }
            lastLength = values.length;
        }
        out.println(results[0]);
    }
}
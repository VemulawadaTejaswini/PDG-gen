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
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split("[ ,\\.]");
            boolean appended = false;
            for (String word : values) {
                if (word.length() >= 3 && word.length() <= 6) {
                    if (!appended) {
                        appended = true;
                    } else {
                        out.print(" ");
                    }
                    out.print(word);
                }
            }
            out.println();
        }
    }
}
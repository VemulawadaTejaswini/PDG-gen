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
            int state = 0;
            int n = 0;
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (state == 0) {
                    if (ch == '@') {
                        state = 1;
                    } else {
                        out.print(ch);
                    }
                } else if (state == 1) {
                    if (ch >= '0' && ch <= '9') {
                        n = ch - '0';
                        state = 2;
                    } else {
                        out.print("@" + ch);
                        state = 0;
                    }
                } else if (state == 2) {
                    for (int j = 0; j < n; j++) {
                        out.print(ch);
                    }
                    state = 0;
                }
            }
            if (state == 1) {
                out.print("@");
            } else if (state == 2) {
                out.print("@" + n);
            }
            out.println();
        }
    }
}
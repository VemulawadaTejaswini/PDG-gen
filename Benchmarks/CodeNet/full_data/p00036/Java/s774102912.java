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
            if (line == null) {
                break;
            }
            if (line.isEmpty()) {
                continue;
            }
            int beginIndex = 0;
            int count = 0;
            for (int i = 0; i < 8; i++) {
                if (count < 4) {
                    for (int j = 0; j < 8; j++) {
                        if (line.charAt(j) == '1') {
                            count++;
                            if (count == 1) {
                                beginIndex = i * 8 + j;
                            } else if (count == 4) {
                                int length = i * 8 + j - beginIndex + 1;
                                out.println(chars[length]);
                                break;
                            }
                        }
                    }
                }
                line = reader.readLine();
            }
        }
    }

    private static final char[] chars = { 0, 0, 0, 0, 'C', 0, 0, 0, 0, 'G',
            'A', 'E', 0, 0, 0, 0, 'D', 0, 'F', 0, 0, 0, 0, 0, 0, 'B' };
}
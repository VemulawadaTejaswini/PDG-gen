
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            int weight = Integer.parseInt(input);
            int n = 1;
            StringBuilder out = new StringBuilder();
            while (n < 1024) {
                if ((weight & n) > 0) {
                    out.append(n).append(" ");
                }
                n = n << 1;
            }
            System.out.println(out.toString().trim());
        }
    }
}
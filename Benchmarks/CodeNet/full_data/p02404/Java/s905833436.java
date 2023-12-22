import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String[] lines = br.readLine().split(" ");
            final int x = Integer.parseInt(lines[0]);
            final int y = Integer.parseInt(lines[1]);
            if (x == 0 && y == 0) break;
            // do something
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if ((i != 0 && i != x - 1) && (j != 0 && j != y - 1)) {
                        sb.append(".");
                    } else {
                        sb.append("#");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
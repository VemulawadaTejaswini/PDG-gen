
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String line = reader.readLine();
        int x = Integer.parseInt(line);

        call(1, x, builder);
        System.out.println(builder);
    }

    public static int call(int i, int n, StringBuilder builder) {
        // 3??§?????????????????? ??????
        int x = i;
        main:
        while (i <= n) {
            if (x % 3 == 0) {
                builder.append(" " + i);
                if (++i <= n) {
                    i = call(i, n, builder);
                    break;
                } else {
                    break;
                }
            }
            // INCLUDE3
            do {
                if (x % 10 == 3) {
                    builder.append(" " + i);
                    if (++i <= n) {
                        i = call(i, n, builder);
                        break;
                    } else {
                        break main;
                    }
                }
                x = x / 10;
            } while (x != 0);
            if (++i <= n) {
                i = call(i, n, builder);
                break;
            } else {
                break main;
            }
        }
        return i;
    }
}
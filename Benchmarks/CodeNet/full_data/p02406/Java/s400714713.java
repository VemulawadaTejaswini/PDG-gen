import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            int x;

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                x = i;

                if (x % 3 == 0) {
                    sb.append(" ").append(i);
                    continue;
                }

                do {
                    if (x % 10 == 3) {
                        sb.append(" ").append(i);
                        break;
                    }
                    x /= 10;
                } while (x != 0);
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}


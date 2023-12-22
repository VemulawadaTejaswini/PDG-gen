import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final String[] S = reader.readLine().split(" ");

        final int q = Integer.parseInt(reader.readLine());
        final String[] T = reader.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < q; ++i) {
            final int t = Integer.parseInt(T[i]);
            for (int j = 0; j < n; ++j) {
                final int s = Integer.parseInt(S[j]);
                if (t == s) {
                    ++count;
                    break;
                } else if (t < s) {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
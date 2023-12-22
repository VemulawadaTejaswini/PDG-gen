import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        while (true) {
            int n = nextInt();

            if (n == 0) {
                break;
            }

            int i = 0, j = 2, k = 1;

            while (true) {
                k += j;

                if (n < k) {
                    break;
                }

                if ((n - k) % j == 0) {
                    i++;
                }

                j++;
            }

            System.out.println(i);
        }
    }

    private static Integer nextInt() throws NumberFormatException, IOException {
        return Integer.parseInt(br.readLine());
    }
}
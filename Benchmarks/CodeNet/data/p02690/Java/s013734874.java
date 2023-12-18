import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            long X = Long.parseLong(br.readLine());
            long A = 0;
            long B = 0;
            for (int i = 0; i > -1000; i--) {
                for (int j = 1;  j < 1000000; j++) {
                    if (X == ((j * j * j * j * j) - (i * i * i * i * i))) {
                        A = j;
                        B = i;
                        break;
                    }
                }
            }

            if (X == 1) {
                A = 0;
                B = -1;
            }
            System.out.println(A + " " + B);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
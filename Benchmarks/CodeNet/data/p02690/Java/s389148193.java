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

            for (int i = 0; i > -X; i--) {
                for (int j = 0;  j < X; j++) {
                    if (X == ((j * j * j * j * j) - (i * i * i * i * i))) {
                        A = j;
                        B = i;
                        break;
                    }
                }
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
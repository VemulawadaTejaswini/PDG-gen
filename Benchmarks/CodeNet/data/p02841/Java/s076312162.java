import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String FAILED_FACE = ":(";

    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {

            int n = Integer.valueOf(br.readLine());

            if (n < 1 || n > 50000) {
                System.out.println(FAILED_FACE);
                return;
            }

            float noTax = (float) n / 1.08f;

            final int rndDown = ((int) noTax);

            if (n == (int) (rndDown * 1.08f))
                System.out.println(rndDown);
            else if (n == (int) ((rndDown - 1) * 1.08f))
                System.out.println(rndDown);
            else if (n == (int) ((rndDown + 1) * 1.08f))
                System.out.println(rndDown);
            else
                System.out.println(FAILED_FACE);

        } catch(IOException e) {
            System.out.println(FAILED_FACE);
        }
    }
}

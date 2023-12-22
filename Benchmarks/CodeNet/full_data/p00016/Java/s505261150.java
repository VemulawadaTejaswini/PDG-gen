
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

final class Main {

    public static double cos(final int rad) {
        return Math.cos(Math.toRadians(rad));
    }

    public static double sin(final int rad) {
        return Math.sin(Math.toRadians(rad));
    }

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));

        double potisionX = 0;
        double potisionY = 0;
        int rad = 90;
        while (true) {
            final String input = inputReader.readLine();
            if (input.equals("0,0")) {
                break;
            }
            final String[] temp = input.split(",");
            potisionY += sin(rad) * Double.parseDouble(temp[0]);
            potisionX += cos(rad) * Double.parseDouble(temp[0]);
            rad -= Integer.parseInt(temp[1]);
            System.err.printf("%f/%f/%d\n", potisionX, potisionY, rad);
        }
        potisionX = potisionX >= 0 ? Math.floor(potisionX) : Math.ceil(potisionX);
        potisionY = potisionY >= 0 ? Math.floor(potisionY) : Math.ceil(potisionY);
        System.out.printf("%.0f\n", potisionX);
        System.out.printf("%.0f\n", potisionY);
    }
}
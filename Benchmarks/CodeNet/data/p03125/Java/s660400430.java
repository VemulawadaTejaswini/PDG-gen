import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");
            int numberA = Integer.parseInt(input[0]);
            int numberB = Integer.parseInt(input[1]);

            int result = numberB - numberA;
            if (numberB % numberA == 0) {
                result = numberA + numberB;
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
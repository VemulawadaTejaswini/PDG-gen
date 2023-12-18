import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int inputNumber = Integer.parseInt(br.readLine());

            int pairCount = 0;
            if (inputNumber % 2 == 0) {
                pairCount = inputNumber / 2 * inputNumber / 2;
            } else {
                pairCount = (inputNumber / 2 + 1) * inputNumber / 2;
            }

            System.out.println(pairCount);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
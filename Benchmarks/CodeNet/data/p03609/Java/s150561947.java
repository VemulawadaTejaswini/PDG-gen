import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");

            int sandglassAvailableSecond = Integer.parseInt(inputString[0]);
            int elapsedSecond = Integer.parseInt(inputString[1]);

            int remainingQuantity = elapsedSecond >= sandglassAvailableSecond ? 0
                    : sandglassAvailableSecond - elapsedSecond;

            System.out.println(remainingQuantity);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
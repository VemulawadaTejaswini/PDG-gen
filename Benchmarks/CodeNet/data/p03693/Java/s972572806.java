import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int inputNumber = Integer.parseInt(br.readLine().replaceAll(" ", ""));

            String result = "NO";

            if (inputNumber % 4 == 0) {
                result = "YES";
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
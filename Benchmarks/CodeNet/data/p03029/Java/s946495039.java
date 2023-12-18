import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> input = Arrays.asList(br.readLine().split(" "));
            int normalAppleCount = Integer.parseInt(input.get(0));
            int errorAppleCount = Integer.parseInt(input.get(1));

            int applePieCount = (normalAppleCount * 3 + errorAppleCount) / 2;

            System.out.println(applePieCount);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
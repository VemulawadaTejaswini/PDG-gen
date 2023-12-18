import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputPrices = br.readLine().split(" ");

            List<Integer> bellPrices = new ArrayList<>();

            for (int i = 0; i < inputPrices.length; i++) {
                bellPrices.add(Integer.parseInt(inputPrices[i]));
            }

            int minPrice = 0;
            bellPrices.sort((i1, i2) -> i1 - i2);
            for (int bellPrice : bellPrices.subList(0, 2)) {
                minPrice += bellPrice;
            }

            System.out.println(minPrice);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
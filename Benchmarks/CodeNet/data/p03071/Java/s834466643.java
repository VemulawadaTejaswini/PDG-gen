import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> input = Arrays.asList(br.readLine().split(" "));
            input = input.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

            int countOfCoinA = Integer.parseInt(input.get(0));
            int countOfCoinB = Integer.parseInt(input.get(1));

            int result = countOfCoinA + countOfCoinB;
            if (result < countOfCoinB * 2 - 1) {
                result = countOfCoinB * 2 - 1;
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
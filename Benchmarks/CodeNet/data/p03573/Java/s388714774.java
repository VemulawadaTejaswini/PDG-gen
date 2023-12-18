import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] numbers = br.readLine().split(" ");
            Map<String, Long> counted = Arrays.asList(numbers).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            counted.entrySet().stream().filter(e -> e.getValue() == 1).forEach(e -> System.out.println(e.getKey()));

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
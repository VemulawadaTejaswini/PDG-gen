import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> inputs = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            inputs.add(scanner.nextInt());
        });

        Integer maxDiff = null;
        Integer size = inputs.size();

        List<Integer> max = new ArrayList<>();
        inputs.stream().sorted(Comparator.reverseOrder()).forEach(i -> max.add(i));
        for (int i = 0; i < size - 1; i++) {
            Integer input = inputs.get(0);
            inputs.remove(0);

            if (input == max.get(0)) {
                max.remove(0);
            }
            if (maxDiff == null || max.get(0) - input > maxDiff) {
                maxDiff = max.get(0) - input;
            }
        }
        System.out.println(maxDiff);
    }
}

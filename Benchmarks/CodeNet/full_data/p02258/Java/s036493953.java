import java.util.ArrayList;
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

        Integer size = inputs.size();
        Integer max = null;
        Integer min = inputs.get(0);
        for (int i = 1; i < size; i++) {
            Integer input = inputs.get(i);
            max = max == null || max < input - min ? input - min : max;
            min = min < input ? min : input;
        }
        System.out.println(max);
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> cache = new HashMap<String, List<Double>>();

        int cnt = Integer.valueOf(sc.nextLine());
        while (0<cnt--) {
            String values = sc.nextLine();
            List<Double> inputs = Stream.of(values.split(" ")).map(input->Double.valueOf(input)).collect(Collectors.toList());
            Double min_x = Math.min(inputs.get(0), Math.min(inputs.get(2), inputs.get(4)));
            Double max_x = Math.max(inputs.get(0), Math.max(inputs.get(2), inputs.get(4)));

            Double min_y = Math.min(inputs.get(1), Math.min(inputs.get(3), inputs.get(5)));
            Double max_y = Math.max(inputs.get(1), Math.max(inputs.get(3), inputs.get(5)));

            Double middle_x = (min_x+max_x)/2;
            Double middle_y = (min_y+max_y)/2;

            System.out.printf("%.3f %.3f %.3f", round.apply(middle_x), round.apply(middle_y), round.apply(Math.sqrt((middle_x - min_x)*(middle_x - min_x)+(middle_y - min_y)*(middle_y - min_y))));
            System.out.println();
        }
    }

    public static UnaryOperator<Double> round = l -> {
        return Double.valueOf(Math.round(l*1000))/1000;
    };
}
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        read().stream().map(Main::calc).forEach(System.out::println);
    }

    static int calc(List<Integer> dataSet) {
        List<Integer> sorted = dataSet.stream().sorted().collect(Collectors.toList());
        double average = sorted.subList(1, sorted.size() - 1).stream().mapToInt(i -> i).average().getAsDouble();
        return (int) Math.floor(average);
    }

    static List<List<Integer>> read() {
        List<List<Integer>> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int length;
        while ((length = scanner.nextInt()) > 0) {
            List<Integer> dataSet = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                dataSet.add(scanner.nextInt());
            }
            list.add(dataSet);
        }
        scanner.close();
        return list;
    }
}
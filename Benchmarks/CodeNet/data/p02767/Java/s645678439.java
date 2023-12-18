import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> {
                    return sc.nextInt();
                })
                .collect(Collectors.toList());
        int avg = (int) Math.round(list.stream().mapToInt(m -> m).average().getAsDouble());
        System.out.println(sum(list, avg));
    }
    private static int sum(List<Integer> list, int num) {
        return list.stream().mapToInt(m -> (int) Math.pow(m - num, 2)).sum();
    }
}

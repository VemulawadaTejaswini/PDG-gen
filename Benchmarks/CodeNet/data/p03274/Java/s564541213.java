import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer min = null;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = scanner.nextInt();
            if (min == null && j >= 0)
                min = Math.min(n - k, i);
            list.add(j);
        }

        if (min == null) {
            System.out.println();
            System.out.println(Math.abs(list.get(list.size() - k)));
        } else {
            System.out.println(IntStream.rangeClosed(0, min)
                    .map(i -> {
                        int min1 = list.get(i);
                        int max1 = list.get(i + k - 1);
                        return min1 < 0 && 0 <= max1 ? max1 - min1 + (-min1 > max1 ? max1 : -min1) : min1 < 0 ? -min1 : max1;
                    }).min()
                    .getAsInt());
        }
    }
}
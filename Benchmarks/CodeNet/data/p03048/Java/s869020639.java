import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            List<Integer> numList = Arrays.stream(args.get(0).split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            int target = numList.get(3);
            int ans = 0;
            for (int i = 0; i <= 3000; i++) {
                int r = numList.get(0) * i;
                if (r > target) {
                    break;
                }
                for (int j = 0; j <= 3000; j++) {
                    int g = numList.get(1) * j;
                    if (r + g > target) {
                        break;
                    }
                    if ((target - r - g) % numList.get(2) == 0) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        };
    }
}

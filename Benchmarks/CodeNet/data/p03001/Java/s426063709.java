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
            long W = Long.valueOf(args.get(0).split(" ")[0]);
            long H = Long.valueOf(args.get(0).split(" ")[1]);
            long x = Long.valueOf(args.get(0).split(" ")[2]);
            long y = Long.valueOf(args.get(0).split(" ")[3]);

            long hSplitMin = W * Math.min(y, H - y);
            long wSplitMin = H * Math.min(x, W - x);
            boolean same = hSplitMin == wSplitMin;
            System.out.printf("%d %d\n", Math.max(hSplitMin, wSplitMin), same ? 1 : 0);
        };
    }

}

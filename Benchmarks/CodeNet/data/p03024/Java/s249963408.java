import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import java.util.function.Consumer;

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
            int k = args.get(0).length();
            long w = args.get(0).codePoints().filter(i -> (char) i == 'o').count();
            boolean cond = w + 15 - k >= 8;
            System.out.println(cond ? "YES" : "NO");
        };
    }

}

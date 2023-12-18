import java.math.BigInteger;
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
            BigInteger W = new BigInteger(args.get(0).split(" ")[0]);
            BigInteger H = new BigInteger(args.get(0).split(" ")[1]);
            BigInteger x = new BigInteger(args.get(0).split(" ")[2]);
            BigInteger y = new BigInteger(args.get(0).split(" ")[3]);

            BigInteger hSplitMin = W.multiply(y.compareTo(H.subtract(y)) < 0 ? y : H.subtract(y));
            BigInteger vSplitMin = H.multiply(x.compareTo(W.subtract(x)) < 0 ? x : W.subtract(x));

            boolean same = hSplitMin.equals(vSplitMin);
            System.out.printf("%s %d\n", hSplitMin.compareTo(vSplitMin) > 0 ? hSplitMin.toString() : vSplitMin.toString(), same ? 1 : 0);
        };
    }

}

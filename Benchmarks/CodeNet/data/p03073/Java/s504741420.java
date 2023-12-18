import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

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
            final char[] numList = args.get(0).toCharArray();

            Integer ans = 0;
            {
                Boolean isOdd0 = numList[0] == '0';
                for (int i = 0; i < numList.length; i++) {
                    if ((i % 2 == 0 && numList[i] == (isOdd0 ? '1' : '0')) || ((i % 2 == 1 && numList[i] == (isOdd0 ? '0' : '1')))) {
                        ans++;
                    }
                }
            }

            Integer recAns = 0;
            {
                Boolean isOdd0 = numList[numList.length - 1] == '0';
                for (int i = 0; i < numList.length; i++) {
                    if ((i % 2 == 0 && numList[numList.length - 1 - i] == (isOdd0 ? '1' : '0')) || ((i % 2 == 1 && numList[numList.length - 1 - i] == (isOdd0 ? '0' : '1')))) {
                        recAns++;
                    }
                }
            }

            System.out.println(Math.min(ans, recAns));
        };
    }

}

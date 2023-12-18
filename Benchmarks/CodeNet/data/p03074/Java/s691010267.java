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
            final List<Integer> NK = Arrays.stream(args.get(0).split(" ")).map(Integer::valueOf).collect(toList());
            final Integer K = NK.get(1);
            final char[] numList = args.get(1).toCharArray();

            Integer max = 0;
            Integer cnt = 0;
            Integer cntLeft1 = 0;
            Integer remainingK = K;
            List<Integer> stack = new ArrayList<>();
            int index = 0;
            while (index < numList.length) {
                if (numList[index] == '1') {
                    cnt++;
                    cntLeft1++;
                    index++;
                } else {
                    Integer cnt0 = 0;
                    while (index < numList.length && numList[index] == '0') {
                        cnt0++;
                        cnt++;
                        index++;
                    }
                    stack.add(cntLeft1 + cnt0);
                    cntLeft1 = 0;
                    if (remainingK > 0) {
                        remainingK--;
                    } else {
                        cnt -= stack.remove(0);
                    }
                }
                max = Math.max(max, cnt);
            }

            System.out.println(max);
        };
    }

}

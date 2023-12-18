import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        int totalMatchCount = count * (count - 1) / 2;
        List<List<Integer>> xs = IntStream
                .range(0, count)
                .mapToObj(it -> IntStream
                        .range(0, count - 1)
                        .map(n -> std.nextInt())
                        .boxed()
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        int matchCount = 0;
        int days = 0;
        while (matchCount != totalMatchCount) {
            List<Integer> skipIndex = new ArrayList<>();
            IntStream.range(0, count)
                    .forEach(it -> {
                        if (skipIndex.contains(it)) {
                            return;
                        }

                        List<Integer> targetSchedules = xs.get(it);
                        if (targetSchedules.isEmpty()) {
                            return;
                        }

                        int opponent = targetSchedules.get(0);
                        if (skipIndex.contains(opponent - 1)) {
                            return;
                        }
                        List<Integer> opponentSchedules = xs.get(opponent - 1);
                        if (opponentSchedules.isEmpty()) {
                            return;
                        }
                        int matched = opponentSchedules.get(0);
                        if (matched == it + 1) {
                            targetSchedules.remove(0);
                            opponentSchedules.remove(0);
                            skipIndex.add(it);
                            skipIndex.add(opponent - 1);
                        }
                    });

            if (skipIndex.size() == 0) {
                days = -1;
                break;
            } else {
                matchCount += skipIndex.size() / 2;
                days++;
            }
        }

        System.out.println(days);
    }
}

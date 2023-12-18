import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        List<Integer> xs = IntStream.range(0, count)
                .map(it -> it + 1)
                .boxed()
                .collect(Collectors.toList());

        int result = 0;
        result = IntStream
                .range(0, xs.size())
                .reduce(0, (acc, it) -> {
                    int nextIndex;
                    if (it == xs.size() - 1) {
                        nextIndex = 0;
                    } else {
                        nextIndex = it + 1;
                    }
                    int value = xs.get(it);
                    int nextValue = xs.get(nextIndex);
                    return acc + (value % nextValue);
                });


        System.out.println(result);
    }
}

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int outputIndex = scanner.nextInt() - 1;

        long[] allInput = new long[num];
        for (int i = 0; i < num; i++) {
            allInput[i] = scanner.nextInt();
        }

        List<BigDecimal> result = combine(allInput).stream()
                .sorted(Comparator.naturalOrder())
                .limit(outputIndex + 1)
                .collect(Collectors.toList());

        System.out.println(result.get(outputIndex).toPlainString());
    }

    static List<BigDecimal> combine(long[] allInput) {
        List<BigDecimal> resultList = new ArrayList<>();

        long[] inputs = allInput;
        while (true) {
            int len = inputs.length;
            if (len <= 1) {
                break;
            }
            BigDecimal base = BigDecimal.valueOf(inputs[0]);
            for (int i = 1; i < len; i++) {
                resultList.add(base.multiply(new BigDecimal(inputs[i])));
            }
            long[] copy = new long[len - 1];
            System.arraycopy(inputs, 1, copy, 0, len - 1);
            inputs = copy;
        }
        return resultList;
    }
}
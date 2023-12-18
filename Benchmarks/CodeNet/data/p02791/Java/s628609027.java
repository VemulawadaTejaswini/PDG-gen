import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;

// 5
// 4 2 5 1 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // formatter off
        System.out.println(
            solve(
                inputStr(sc, " "),
                inputStr(sc, " ")
            )
        );
    }

    /**
     * 指定された区切り文字で区切られた１行の文字列を、文字列配列にして返します。
     */
    private static String[] inputStr(Scanner sc, String... delimiter) {
        return sc.nextLine().split(delimiter == null ? " " : delimiter[0]);
    }

    private static Long[] convertStrToInt(String[] strArray) {
        return Arrays.stream(strArray).map(e -> new Long(Long.parseLong(e))).toArray(Long[]::new);
    }

    private static long outputResult(long a, long b) {
        return LongStream.range(0, b).reduce((long) 0, (sum, i) -> sum += (Math.pow(10, i) * a));
    }

    private static long solve(String[]... inputs) {
        Long[] firstArr = convertStrToInt(inputs[0]);
        long a = firstArr[0];
        Long[] secondArr = convertStrToInt(inputs[1]);

        Predicate<Integer> pred = (i)->Arrays.stream(secondArr).limit(i).max(Comparator.reverseOrder()).get() == secondArr[i-1];
        return IntStream.range(1, (int)(a + 1)).reduce(0, (cnt, i) -> pred.test(i) ? ++cnt : cnt);
    }
}

import java.util.*;
import java.lang.*;
import java.util.stream.LongStream;


// 10 3
// 4 5 6
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(inputStr(sc, " ")));
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
        return LongStream.range(0, b).reduce((long) 0, (sum, i)->sum+=(Math.pow(10, i) * a));
    }

    private static long solve(String[]... inputs) {
        Long[] firstArr = convertStrToInt(inputs[0]);
        long a = firstArr[0];
        long b = firstArr[1];
        return a > b ? outputResult(b, a) : outputResult(a, b);
    }
}

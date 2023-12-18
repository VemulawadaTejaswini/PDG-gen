import java.util.*;
import java.lang.*;

// 10 3
// 4 5 6
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(inputStr(sc, " "), inputStr(sc, " ")));
        // System.out.println(solve(inputStr(sc, " "), inputStr(sc, " ")) ? "Yes" :
        // "No");
    }

    /**
     * 指定された区切り文字で区切られた１行の文字列を、文字列配列にして返します。
     */
    private static String[] inputStr(Scanner sc, String... delimiter) {
        return sc.nextLine().split(delimiter == null ? " " : delimiter[0]);
    }

    private static Integer[] convertStrToInt(String[] strArray) {
        return Arrays.stream(strArray).map(e -> new Integer(Integer.parseInt(e))).toArray(Integer[]::new);
    }

    private static int solve(String[]... inputs) {
        Integer[] firstArr = convertStrToInt(inputs[0]);
        int n = firstArr[0];
        int k = firstArr[1];
        Integer[] secondArr = convertStrToInt(inputs[1]);

        return Arrays.stream(secondArr).sorted(Comparator.reverseOrder()).skip(k).reduce(0, (sum, e) -> sum += e);
    }
}

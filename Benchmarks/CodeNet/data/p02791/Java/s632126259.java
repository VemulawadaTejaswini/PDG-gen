import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // formatter off
        System.out.println(solve(inputStr(sc, " "), inputStr(sc, " ")));
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

        Predicate<Integer> pred = (
                i) -> Arrays.stream(secondArr).limit(i).max(Comparator.reverseOrder()).get() == secondArr[i - 1];
        // return IntStream.range(1, (int) (a + 1)).reduce(0, (cnt, i) -> pred.test(i) ?
        // ++cnt : cnt);
        Resp res = new Resp(Long.MAX_VALUE, 0);
        IntStream.range(0, (int) (a)).boxed().reduce(res, (p, i) -> {
            if (secondArr[i] <= p.getMin()) {
                p.setMin(secondArr[i]);
                p.addCont();
            }
            return p;
        }, (res1, res2) -> res2);
        return res.getCont();
    }
}

class Resp {
    private long min = Long.MAX_VALUE;
    private int cont = 0;

    public Resp(long min, int cont) {
        this.min = min;
        this.cont = cont;
    }

    public long getMin() {
        return this.min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public int getCont() {
        return this.cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void addCont() {
        this.cont++;
    }

}

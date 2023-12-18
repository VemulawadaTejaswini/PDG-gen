import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] firstArr = sc.nextLine().split(" ");
        // System.out.println(solve(getInputAsArray(sc, "1")));
        System.out.println(solve(sc.nextLine().split(" ")));
    }

    private static List<String[]> getInputAsArray(Scanner sc, String count) {
        List<String[]> result = new ArrayList<>();
        IntStream.range(0, Integer.parseInt(count)).forEach(i -> result.add(sc.nextLine().split(" ")));
        return result;
    }

    private static Long[] convertStrToInt(String[] strArray) {
        return Arrays.stream(strArray).map(e -> new Long(Long.parseLong(e))).toArray(Long[]::new);
    }

    private static long outputResult(long a, long b) {
        return LongStream.range(0, b).reduce((long) 0, (sum, i) -> sum += (Math.pow(10, i) * a));
    }

    // private static String solve(List<String[]> input) {
    private static String solve(String[] input) {
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long k = Long.parseLong(input[2]);

        if (a >= k) {
            return String.valueOf(a - k) + " " + String.valueOf(b);
        } else {
            if (a + b >= k) {
                return String.valueOf(0) + " " + String.valueOf(b - k + a);
            } else {
                return String.valueOf(0) + " " + String.valueOf(0);
            }
        }
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

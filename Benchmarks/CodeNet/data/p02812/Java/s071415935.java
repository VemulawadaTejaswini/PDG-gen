import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;

// 文字列を一文字ずつ配列にしてStream
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstArr = sc.nextLine().split(" ");
        System.out.println(solve(getInputAsArray(sc, "1")));
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

    private static String solve(List<String[]> input) {
        Predicate<String> predicate = (str) -> str.equals("A") || str.equals("B") || str.equals("C");
        BiPredicate<String, String> strCheker = (accum, str) -> {
            // System.out.println(accum + " " + str);
            Map<String, String> map = new HashMap<>();
            map.put("A", "");
            map.put("B", "A");
            map.put("C", "AB");
            return accum.equals("A") || accum.equals(map.get(str));
        };
        ArrayList<String> result = new ArrayList<>();
        Arrays.stream(input.get(0)[0].split("")).reduce("", (accum, value) -> {
            // System.out.println("---" + accum + "----" + value);
            if (value.equals("A")) {
                accum = "A";
            } else if (strCheker.test(accum, value)) {
                accum += value;
            }
            if (accum.equals("ABC")) {
                // System.out.println("avc");
                result.add(value);
                return "";
            }
            return accum;
        });
        return String.valueOf(result.size());
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

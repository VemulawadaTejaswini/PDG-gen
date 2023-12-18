import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long ans = total(s, new ArrayList<>(), 0, 1);
        System.out.println(ans);
    }

    static long total(String s, List<Long> values, int from, int to) {
        if (to == s.length()) {
            values.add(Long.valueOf(s.substring(from, to)));
            long total = 0;
            for (Long i : values) {
                total += i;
            }
            return total;
        }
        long total = 0;
        List<Long> cValues = new ArrayList<>();
        cValues.addAll(values);
        total += total(s, cValues, from, to + 1);
        cValues.clear();
        cValues.addAll(values);
        cValues.add(Long.valueOf(s.substring(from, to)));
        total += total(s, cValues, to, to + 1);
        return total;
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextLong();
        }
        long[] summaries = new long[n];
        long count = 0L;
        Map<Long, Integer> countNums = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final long s = (i == 0 ? 0L : summaries[i - 1]) + a[i];
            summaries[i] = s;
            if (s == 0) count++;
            int countNum = countNums.getOrDefault(s, 0);
            count += countNum;
            countNums.put(s, countNum + 1);
        }
        System.out.println(count);
    }
}

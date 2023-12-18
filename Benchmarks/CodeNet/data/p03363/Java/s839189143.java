import java.util.Arrays;
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
        for (int i = 0; i < n; i++) {
            final long s = (i == 0 ? 0L : summaries[i - 1]) + a[i];
            summaries[i] = s;
            if (s == 0) count++;
            count += Arrays.stream(summaries, 0, i).filter(x -> x == s).count();
        }
        System.out.println(count);
    }
}

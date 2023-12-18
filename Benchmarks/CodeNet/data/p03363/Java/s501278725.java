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
        summaries[0] = a[0];
        long count = a[0] == 0 ? 1L : 0L;
        for (int i = 1; i < n; i++) {
            summaries[i] = summaries[i - 1] + a[i];
            if (i > 1 && summaries[i] == 0) count++;
        }
        Arrays.sort(summaries);
        for (int i = 0, j = 1; i < n - 1; i = j) {
            int sameNumCount = 1;
            long si = summaries[i];
            for (j = i + 1; j < n && summaries[j] == si; j++) {
                sameNumCount++;
            }
            count += sameNumCount * (sameNumCount - 1) / 2;
        }
        System.out.println(count);
    }
}

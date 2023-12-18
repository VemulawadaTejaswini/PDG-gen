import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        a[0] = sc.nextLong();
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }
        List<Long> bubun = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            bubun.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    bubun.add(a[j] - a[i]);
                }
            }
        }
        long max = 0;
        for (int i = 40; i >= 0; i--) {
            long bit = max + (long)Math.pow(2, i);
            int count = 0;
            for (int j = 0; j < bubun.size(); j++) {
                if ((bubun.get(j) & bit) == bit) {
                    count++;
                }
            }
            if (count >= k) {
                max += Math.pow(2, i);
            }
        }
        System.out.println(max);
    }

}
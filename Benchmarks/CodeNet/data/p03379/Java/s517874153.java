import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] original = new long[n];
        long[] sorted = new long[n];

        for (int i = 0; i < n ; i++) {
            long value = sc.nextLong();
            original[i] = value;
            sorted[i] = value;
        }

        Arrays.sort(sorted);

        int globalMedianIndex = (sorted.length + 1)/2 - 1;
        long median = sorted[globalMedianIndex];

        for (long value: original
             ) {
            long ans;
            if (median >= value) {
                ans = sorted[globalMedianIndex + 1];
            } else {
                ans = median;
            }
            System.out.println(ans);
        }
    }
}
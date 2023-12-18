import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long m = sc.nextInt();
            array[i] = m;
            sum += m;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (array[i] < array[j]) {
                    long m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }
        long l = 0;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            l += array[i];
            long o = Math.abs(2 * l - sum);
            if (o < ans) {
                ans = o;
            }
        }
        System.out.println(ans);
    }
}

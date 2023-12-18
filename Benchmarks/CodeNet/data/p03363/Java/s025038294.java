import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + sc.nextLong();
        }
        long count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (sum[i] - sum[j] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

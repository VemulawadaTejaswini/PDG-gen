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
        long b[] = new long[n * (n + 1)];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[(i + 1) * n + j] = a[j] - a[i];
            }
        }
        Arrays.sort(b);
        long bit = b[n * (n + 1) - 1];
        for (int i = 1; i < k; i++) {
            bit = bit & b[n * (n + 1) - (i + 1)];
        }
        System.out.println(bit);
    }

}
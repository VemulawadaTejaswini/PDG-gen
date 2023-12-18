import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < m; i++) {
            a[scanner.nextInt() - 1]++;
            a[scanner.nextInt()]--;
        }

        Arrays.parallelPrefix(a, Integer::sum);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}
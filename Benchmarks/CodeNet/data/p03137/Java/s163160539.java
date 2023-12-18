import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int[] d = new int[m - 1];
        for (int i = 0; i < m - 1; i++) {
            d[i] = x[i + 1] - x[i];
        }
        Arrays.sort(d);
        if (n >= m) {
            System.out.println(0);
        } else {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += d[m - 2 - i];
            }
            System.out.println(x[m - 1] - x[0] - sum);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        int ans = 0;
        double flag = (double) total / (4 * m);
        for (int i = 0; i < n; i++) {
            if (a[i] >= flag)
                ans++;
        }

        System.out.println(ans >= m ? "Yes" : "No");
    }
}
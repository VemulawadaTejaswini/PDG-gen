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
        Arrays.sort(a, Collections.reverseOrder());
        boolean ans = true;
        int flag = total / (4 * m);
        for (int i = 0; i < m; i++) {
            if (a[i] < flag) {
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Yes" : "No");
    }
}
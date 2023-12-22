import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            ans += a[i];
        }
        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            for (int j = 0; j < n; j++) {
                if (a[j] == b) {
                    ans -= a[j];
                    ans += c;
                    a[j] = c;
                }
            }
            System.out.println(ans);
        }
    }
}
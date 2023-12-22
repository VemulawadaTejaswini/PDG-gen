import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        long ans = 0L;
        int h = a[0];
        for (int i = 1; i < n; i++) {
            ans += Math.max(0, h - a[i]);
            h = Math.max(h, a[i]);
        }
        System.out.println(ans);
    }
}

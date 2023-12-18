import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String n = sc.next();
        int x = Integer.parseInt(sc.next());
        // int[] a = new int[n];

        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        //
        // }

        int ans = 0;
        int num = x;
        ans += (x / 500) * 1000;
        num -= (x / 500) * 500;
        ans += (num / 5) * 5;

        System.out.println(ans);

    }
}
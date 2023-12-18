import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        long xr = Math.min((w - x) * h, x * h);
        long yr = Math.min((h - y) * w, y * w);

        StringBuilder builder = new StringBuilder(String.valueOf(Math.max(xr, yr)));
        int ans = xr == yr ? 1 : 0;
        builder.append(" " + ans);

        System.out.println(builder);
    }
}
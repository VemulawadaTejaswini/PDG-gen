import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long now = 100;
        int ans = 0;
        while (now < X) {
            if (now >= 1_000_000_000_000_000L) {
                now = now/100*101;
            } else {
                now = now*101/100;
            }
            ans++;
        }
        System.out.println(ans);
    }
}

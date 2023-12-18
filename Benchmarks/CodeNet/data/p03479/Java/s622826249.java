import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ans = 1;
        while (true) {
            if (y >= x * 2) {
                ans++;
                x *= 2;
            } else
                break;
        }
        System.out.println(ans);
    }
}

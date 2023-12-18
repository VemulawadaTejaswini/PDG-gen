import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = 0;
        ans += x / 500 * 1000;
        x %= 500;
        ans += x / 5 * 5;
        System.out.println(ans);
    }
}
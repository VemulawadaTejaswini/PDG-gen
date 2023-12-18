import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long ans = b/x - a/x;
        if(a % x == 0) ans++;
        System.out.println(ans);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long ans = (b-a) / x;
        System.out.println(a % x == 0 ? ans+1 : ans);
    }
}

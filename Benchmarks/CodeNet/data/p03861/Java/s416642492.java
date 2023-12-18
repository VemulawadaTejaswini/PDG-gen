import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Double x = (double)sc.nextLong();
        long ans = (int)Math.ceil(b/x)-(int)Math.ceil(a/x)+1;
        System.out.println(ans);
    }
}

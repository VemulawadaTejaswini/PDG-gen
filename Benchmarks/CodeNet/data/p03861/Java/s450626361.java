import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long ret = 0;
        if (b-a>=x) {
            ret = (b-a)/x;
            if (a%x==0) ret++;
        } else if (a<=x&&x<=b) {
            ret++;
        }
        System.out.println(ret);
    }
}

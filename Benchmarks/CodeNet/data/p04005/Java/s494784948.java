import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        if (a%2==0||a%2==0||a%2==0) {
            System.out.println(0);
        } else {
            long ret = Long.MAX_VALUE;
            ret = Math.min(ret, a*b);
            ret = Math.min(ret, a*c);
            ret = Math.min(ret, b*c);
            System.out.println(ret);
        }
    }
}

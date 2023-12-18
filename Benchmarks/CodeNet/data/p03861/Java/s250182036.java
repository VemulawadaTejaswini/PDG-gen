import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        System.out.println(calc(b,x)-calc(a-1,x));
    }
    
    private static long calc(long n, long d) {
        if (n<0) return 0;
        return n/d+1;
    }
}

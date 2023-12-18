import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(xor(b) ^ xor(a - 1));
        sc.close();
    }
    static long xor(long x) {
        if (x % 2 != 0) {
            if ((x + 1) / 2 % 2 != 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return xor(x + 1) ^ (x + 1);
        }
    }
}
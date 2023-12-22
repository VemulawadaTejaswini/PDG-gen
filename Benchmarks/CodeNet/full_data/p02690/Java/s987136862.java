
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        outer: for (long a = 1000; a > 0; a--) {
            for (long b = a; b > -1000; b--) {
                if (pow(a, 5) - pow(b, 5) == x) {
                    System.out.printf("%d %d\n", a, b);
                    break outer;
                }
            }
        }
    }
    static  long pow(long num, long times) {
        long result = 1;
        for (long i = 0; i < times; i++) {
            result *=  num;
        }
        return result;
    }
}

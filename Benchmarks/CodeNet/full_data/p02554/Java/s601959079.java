import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long res = (((pow(10, n)% 1000000007  + pow(8, n)% 1000000007))% 1000000007 - 2 * pow(9, n)% 1000000007 + 1000000007)% 1000000007;
        System.out.println(res);
    }

    public static long pow(long a, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = ((res % 1000000007) * (a % 1000000007)) % 1000000007;
                n--;
            } else {
                a = ((a % 1000000007) * (a % 1000000007)) % 1000000007;
                n /= 2;
            }

        }
        return res % 1000000007;
    }
}

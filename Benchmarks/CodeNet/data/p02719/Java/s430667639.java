import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long x = n;
        if (n % k == 0) {
            x = 0;
        } else if (n % k == 1) {
            x = 1;
        } else {
            while (x >= Math.abs(n - k) || x >= k) {
                x = Math.abs(x - k);
            }
        }

        System.out.print(x);
    }
}

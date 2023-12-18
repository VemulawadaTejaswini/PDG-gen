import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = (x / 11) * 2;
        long b = x % 11;
        if (b != 0) {
            if (b <= 6) {
                a++;
            } else {
                a += 2;
            }
        }
        System.out.println(a);
    }
}
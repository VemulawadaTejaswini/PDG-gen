
import java.util.Scanner;

public class Main {
    static void solve(long x) {
        for (int a = 0; a<=1000;a++) {
            for (int b=-1000;b<=1000;b++) {
                if (a*a*a*a*a - b*b*b*b*b == x) {
                    System.out.println(a + " " + b);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        solve(x);
    }
}
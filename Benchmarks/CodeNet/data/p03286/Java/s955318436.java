import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String ans = "";
        if (N == 0) {
            System.out.println("0");
        }
        while (true) {
            if (N == 0) {
                char[] a = ans.toCharArray();
                for (int i = ans.length() - 1; i >= 0; i--) {
                    System.out.print(a[i]);
                }
                return;
            }
            if (N % 2 == 1 || N % 2 == -1) {
                ans += "1";
                N = (N - 1) / -2;
            } else {
                ans += "0";
                N = N / -2;
            }
        }
    }
}
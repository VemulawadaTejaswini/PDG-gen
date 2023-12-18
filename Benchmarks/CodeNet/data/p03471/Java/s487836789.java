import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt() / 1000;
        int a = -1;
        int b = -1;
        int c = -1;
        out: for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if (10 * i + 5 * j + (n - i - j) == y) {
                    a = i;
                    b = j;
                    c = n - i - j;
                    break out;
                }
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}

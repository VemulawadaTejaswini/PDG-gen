import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        while (n > 0) {
            if (n - 1000 <= 0) {
                System.out.println(1000 - n);
                return;
            }
            n -= 1000;
        }
    }
}
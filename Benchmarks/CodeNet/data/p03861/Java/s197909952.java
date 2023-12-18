import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        if (b - a <= 0) {
            System.out.println("0");
            return;
        }
        long ans = (b / x) - (a / x);
        if (a % x == 0 && b % x == 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
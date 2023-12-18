import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        if (a == 0 && b == 0) {
            System.out.println("1");
            return;
        }
        long ans = a == 0
                ? ((b + 1) / x) : (b / x) - ((a - 1) / x);
        System.out.println(ans);
    }
}
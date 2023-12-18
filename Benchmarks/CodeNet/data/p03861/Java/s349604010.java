import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long x = Long.parseLong(sc.next());
        long ans = (b / x) - (a / x);
        if (a % x == 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
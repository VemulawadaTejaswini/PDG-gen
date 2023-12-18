import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
        long now = 1;
        if (k >= a) {
            k -= a;
            now += a;
        } else {
            System.out.println(k + 1);
            return;
        }
        if (b - a >= 2) {
            now += (b-a)*(k/2);
            now += k % 2 == 1 ? 1 : 0;
        } else {
            now += k;
        }
        System.out.println(now);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        if ((B - A) % 2 == 0) {
            System.out.println((B - A) / 2);
            return;
        }
        long l1 = B - 1;
        long l2 = N - A;
        long l3 = N - B + 1 + (B - A - 1) / 2;
        long l4 = A + (B - A - 1) / 2;
        long a1 = l1 <= l3 ? l1 : l3;
        long a2 = l2 <= l4 ? l2 : l4;
        long ans = a1 <= a2 ? a1 : a2;
        System.out.println(ans);
    }
}
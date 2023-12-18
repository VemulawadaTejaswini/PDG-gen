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
        long ans = l1 <= l2 ? l1 : l2;
        System.out.println(ans);

    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = Long.parseLong(sc.next());
        long r = Long.parseLong(sc.next());
        long ans = Long.MAX_VALUE;
        long num = 0;
        for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                num = (i * j) % 2019;
                if (num < ans) {
                    ans = num;
                }
                if (num == 0) {
                    System.out.println(0);
                    return;
                }
            }
        }
        System.out.println(ans);
    }
}
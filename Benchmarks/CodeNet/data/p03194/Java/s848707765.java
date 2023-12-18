import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = 1;

        for (long i = 1; Math.pow(i, n) <= p; i++) {
            long tag = p;
            boolean flag = true;
            if (p % Math.pow(i, n) == 0) {
                ans = i;
            }
        }
        System.out.println(ans);

    }
}
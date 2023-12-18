import java.util.Scanner;

public class Main {

    static long x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abx = sc.nextLine().split(" ");
        long a = Long.parseLong(abx[0]);
        long b = Long.parseLong(abx[1]);
        x = Long.parseLong(abx[2]);

        long ans = solve(b) - solve(a - 1);
        System.out.println(ans);
    }

    private static long solve(long n) {
        if (n >= 0) {
            return n / x + 1;
        } else {
            return 0;
        }
    }
}

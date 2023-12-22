import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();

        for (long i = X - 1; i >= X / 2; i++) {
            if (judge(i) && judge(X - i)) {
                System.out.println((long) Math.pow(i, 1. / 5) + " " + (long) Math.pow((X - i), 1. / 5));
                return;
            }
        }
    }

    public static boolean judge(long x) {
        return (Math.pow(x, 1. / 5) % 1 == 0);
    }
}

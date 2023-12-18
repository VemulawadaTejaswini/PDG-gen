import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc165/tasks/abc165_a
 */

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(canCarry(k, a, b) ? "OK" : "NG");

        scanner.close();

    }

    public static boolean canCarry(int k, int a, int b) {
        if (a % k == 0 || b % k == 0) return true;

        int c = a + (k - (a % k));
        if (c <= b) return true;
        return false;
    }
}
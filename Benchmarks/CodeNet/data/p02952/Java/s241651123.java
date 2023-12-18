import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n));
    }

    static int helper(int n) {
        int res = 0;
        if (n < 10) {
            res = n;
        } else if (n < 100) {
            res = 9;
        } else if (n < 1000) {
            res = n - 90;
        } else if (n < 10000) {
            res = 909;
        } else if (n < 100000) {
            res = n + 910 - 10000;
        } else if (n == 100000) {
            res = 90909;
        }
        return res;
    }
}
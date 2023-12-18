import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int d = sc.nextInt(), n = sc.nextInt();
        int base;
        if (d == 0) {
            base = 1;
        } else if (d == 1) {
            base = 100;
        } else {
            base = 10000;
        }
        int ans = base * n;
        System.out.println(ans);
    }
}
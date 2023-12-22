import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        System.out.println(greatestCommonDivisor(a[0], a[1]));
    }

    private static int greatestCommonDivisor(int a, int b) {
        int big, small;
        if (a == b) {
            return a;
        } else if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        while (true) {
            int x = big % small;
            if (x == 0) {
                return small;
            } else {
                big = small;
                small = x;
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    //Snack
    //求最小公倍数, 我也不知道怎么写, 试试辗转相除法求最小公约数?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(helper(a, b));
        sc.close();
    }

    static int helper(int a, int b) {
        int v = a, u = b, y;
        while (b > 0) {
            y = a % b;
            a = b;
            b = y;
        }
        return v * u / a;
    }
}

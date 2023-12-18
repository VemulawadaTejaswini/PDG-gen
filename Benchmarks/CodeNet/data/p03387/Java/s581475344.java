import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            calc(a, b, c);
        } else if (b > a && b > c) {
            calc(b, a, c);
        } else if (c > b && c > a) {
            calc(c, b, a);
        }
    }

    private static void calc(int n1, int n2, int n3) {
        int diff1 = Math.abs(n1 - n2);
        int diff2 = Math.abs(n1 - n3);
        int count1 = diff1 / 2;
        int count2 = diff2 / 2;

        n2 = n2 + count1 * 2;
        n3 = n3 + count2 * 2;

        int ans = count1 + count2;
        if (n1 == n2 && n2 == n3) {
            System.out.println(ans);
        } else if ((n1 == n2 && n1 > n3) || (n1 == n3 && n1 > n2)) {
            System.out.println(ans + 2);
        } else {
            System.out.println(ans + 1);
        }

    }
}

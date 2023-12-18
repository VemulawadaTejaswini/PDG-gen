import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();

        if (a1 * t1 + a2 * t2 == b1 * t1 + b2 * t2) {
            System.out.println("infinity");
            System.exit(0);
        }

        long dif1 = a1 * t1 - b1 * t1;
        long dif2 = a2 * t2 - b2 * t2;

        long ans;
        // aの方が最初に早い || bの方が最初に早い
        if ((dif1 > 0 && dif1 + dif2 < 0) || (dif1 < 0 && dif1 + dif2 > 0)) {
            if (-dif1 % (dif1 + dif2) == 0) {
                ans = -dif1 / (dif1 + dif2) * 2;
            } else {
                ans = -dif1 / (dif1 + dif2) * 2 + 1;
            }
        } else {
            ans = 0;
        }
        System.out.println(ans);

        sc.close();
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int ans = 0;
        if (k <= a) {
            ans += k;
            System.out.println(ans);
        } else {
            k -= a;
            ans += a;
            if (k <= b) {
                System.out.println(ans);
            } else {
                k -= b;
                if (k <= c) {
                    ans += k * -1;
                    System.out.println(ans);
                } else {
                    ans += k * -1;
                    System.out.println(ans);
                }
            }
        }

        sc.close();
    }

}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int y = sc.nextInt();
        String ans = "";

        if (n * 10000 >= y) {
            int m = y / 10000;
            int amari = y - m * 10000;
            int f = 0;
            if (amari >= 5000) {
                f++;
                amari -= 5000;
            }
            int t = amari / 1000;
            if (m + f + t <= n) {
                ans = m + " " + f + " " + t;
            }
        }

        if (ans.isEmpty()) {
            ans = "-1 -1 -1";
        }

        System.out.println(ans);
    }
}
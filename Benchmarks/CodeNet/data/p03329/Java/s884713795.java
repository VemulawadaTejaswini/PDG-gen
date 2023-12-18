import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();

        int ans = n;
        for (int i = 0; i <= n; i++) {
            ans = Math.min(ans, count(i, 6) + count(n - i, 9));
        }

        System.out.println(ans);
    }

    private int count(int money, int radix) {
        char array[] = Integer.toString(money, radix).toCharArray();

        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            cnt += array[i] - '0';
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}

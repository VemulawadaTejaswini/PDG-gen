import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        if (n * 2 >= m) {
            ans = m / 2;
        } else {
            ans = n;
            m -= n * 2;
            ans += m / 4;
        }
        System.out.println(ans);
    }
}
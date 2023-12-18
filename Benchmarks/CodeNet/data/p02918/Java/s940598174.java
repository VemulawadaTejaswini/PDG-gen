import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int rlnum = 0;
        for (int pos = s.indexOf("RL"); 0 <= pos; pos = s.indexOf("RL", pos + 2)) {
            rlnum++;
        }
        int rltobehappy = Integer.min(k, rlnum);
        k -= rltobehappy;
        int unhappy = 2 * (rlnum - rltobehappy);
        if (s.charAt(0) == 'L') {
            if (0 < k) {
                k--;
            } else {
                unhappy++;
            }
        }
        if (s.charAt(n - 1) == 'R') {
            if (k <= 0) {
                unhappy++;
            }
        }
        System.out.println(n - unhappy);
    }
}

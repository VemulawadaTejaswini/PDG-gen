import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 999;
        for (int i = 0; i < S.length() - 2; i++) {
            String sub = S.substring(i, i + 3);
            int n = Integer.parseInt(sub);
            ans = Math.min(ans, Math.abs(n - 753));
        }
        System.out.println(ans);
    }
}
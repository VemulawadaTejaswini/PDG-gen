import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'W') {
                ans += res;
            } else {
                res++;
            }
        }
        System.out.println(ans);
    }
}
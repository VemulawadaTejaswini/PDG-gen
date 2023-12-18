import java.util.*;
 
class Main {
    static Scanner sc;
    static String s;
    static int[] lbs;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        s = sc.nextLine();
        lbs = new int[s.length() + 1];
        Arrays.fill(lbs, 0);
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '>') {
                cnt++;
            } else {
                cnt = 0;
            }
            lbs[i] = cnt;
        }
        int ans = 0;
        int crt = 0;
        for (int i = 0; i < s.length() + 1; i++) {
            if (i > 0 && s.charAt(i - 1) == '<') {
                crt++;
            } else {
                crt = 0;
            }
            crt = Math.max(crt, lbs[i]);
            ans += crt;
        }
        System.out.println(ans);
    }
}

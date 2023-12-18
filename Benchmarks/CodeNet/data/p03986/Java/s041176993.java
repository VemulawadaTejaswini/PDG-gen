import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        long sCnt = 0;
        long tCnt = 0;
        boolean sOk = false;
        boolean tOk = false;
        long ans = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'S') {
                if (tOk) {
                    ans += Math.min(sCnt, tCnt);
                    sCnt = 0;
                    tCnt = 0;
                    tOk = false;
                }
                sCnt++;
                sOk = true;
            } else if (sOk && x.charAt(i) == 'T') {
                tCnt++;
                tOk = true;
            }
            // System.out.printf("s = %d ,t = %d %n", sCnt, tCnt);
            // System.out.printf("ans = %d %n", ans);
        }
        ans += Math.min(sCnt, tCnt);
        System.out.println(x.length() - 2 * ans);
    }
}

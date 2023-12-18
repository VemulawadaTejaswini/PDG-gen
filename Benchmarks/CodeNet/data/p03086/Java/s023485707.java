import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * 部分文字列を全探索
         * ATCG文字列であるかを判定する
         * */

        String S = sc.next();
        String sub;
        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < S.length() + 1; i++) {
            for (int j = i + 1; j < S.length() + 1; j++) {
                sub = S.substring(i, j);
                cnt = 0;
                for (int k = 0; k < sub.length(); k++) {
                    if (sub.charAt(k) == 'A' || sub.charAt(k) == 'T' || sub.charAt(k) == 'C' || sub.charAt(k) == 'G') {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}

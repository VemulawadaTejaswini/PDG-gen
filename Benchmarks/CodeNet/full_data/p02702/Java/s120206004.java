import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        StringBuilder sb = new StringBuilder(s);

        int result = 0;
        final int maxIndex = s.length() - 4;
        final int len = s.length();
        for (int i = 0; i < maxIndex; i++) {
            for (int j = i + 4; j <= len; j++) {
                if (isMultiple2019(sb.substring(i, j))) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }

    public static boolean isMultiple2019(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (8 < sb.length()) {
            int len = sb.length();

            String head = sb.substring(0, len - 4);

            int left = Integer.parseInt(sb.substring(len - 4, len - 1));
            int right = Integer.parseInt(sb.substring(len - 1, len)) * 2;
            String foot = Integer.toString(left - right);

            sb = new StringBuilder(head + foot);
        }

        int num = Integer.parseInt(sb.toString());
        boolean judge = num % 2019 == 0;

        return judge;
    }
}

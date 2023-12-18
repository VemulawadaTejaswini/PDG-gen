import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int n = s.length();
        StringBuffer sb = new StringBuffer(s);

        boolean judge = false;
        if (s.equals(sb.reverse().toString())) {
            String head = s.substring(0, n / 2);
            sb = new StringBuffer(head);

            if (head.equals(sb.reverse().toString())) {
                String foot = s.substring((n + 3) / 2 - 1, n);
                sb = new StringBuffer(foot);

                judge = foot.equals(sb.reverse().toString());

            }

        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}

import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int len = s.length() - 2;
        int halfIndex = len / 2;

        int result = 0;
        for (int i = 0; i < halfIndex; i++) {
            String head = s.substring(0, halfIndex - i);
            String foot = s.substring(halfIndex - i, len - i * 2);
            if (head.equals(foot)) {
                result = head.length() * 2;
                break;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}

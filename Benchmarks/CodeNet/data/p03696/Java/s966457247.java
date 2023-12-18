import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        String[] array = s.replace(")(", "),(").split(",");
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String[] brackets = array[i].replace("()", "(,)").split(",");
            if (brackets.length == 1) {
                if (brackets[0].charAt(0) == '(') {
                    right.append(repeat(')', brackets[0].length()));
                } else {
                    left.append(repeat('(', brackets[0].length()));
                }
            } else {
                int diff = brackets[0].length() - brackets[1].length();
                if (0 < diff) {
                    right.append(repeat(')', diff));
                } else if (diff < 0) {
                    left.append(repeat('(', diff * -1));
                }
            }
        }
        String result = left.toString() + String.join("", array) + right.toString();

        // 出力
        System.out.println(result);
    }

    private static String repeat(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}

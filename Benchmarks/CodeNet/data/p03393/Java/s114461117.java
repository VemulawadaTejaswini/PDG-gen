import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        String result = solve(s);

        // 出力
        System.out.println(result);
    }

    private static String solve(String s) {
        if ("zyxwvutsrqponmlkjihgfedcba".equals(s)) {
            return "-1";
        }

        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        boolean[] isUsed = new boolean[26];

        if (s.length() < 26) {
            for (char c : s.toCharArray()) {
                isUsed[(int) c - 97] = true;
            }
            for (int i = 0; i < isUsed.length; i++) {
                if (!isUsed[i]) {
                    s += alphabets[i];
                    break;
                }
            }
            return s;

        } else {
            char[] c = s.toCharArray();
            for (int i = 25; 0 < i; i--) {
                char right = c[i];
                char left = c[i - 1];
                isUsed[(int) right - 97] = true;
                c[i] = '*';
                if (left < right) {
                    for (int j = (int) left - 97; j < 26; j++) {
                        if (isUsed[j]) {
                            c[i - 1] = alphabets[j];
                            break;
                        }
                    }
                    break;
                }
            }
            return new String(c).replace("*", "");
        }
    }
}

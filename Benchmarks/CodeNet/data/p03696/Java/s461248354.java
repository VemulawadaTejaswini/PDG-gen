import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        String ans = solve(n, s);
        System.out.println(ans);
    }

    static String solve(int n, String s) {
        int cnt = countPare(s);
        if (cnt == 0 && s.charAt(0) == '(') {
            // 括弧の誤差無しで、1文字目が開き括弧である
            return s;
        }

        String ans = "";
        if (cnt < 0) {
            ans = insert(s, "(", Math.abs(cnt));
        } else if (cnt > 0) {
            ans = insert(s, ")", Math.abs(cnt));
        } else {
            ans = insert(s, ")", s.length() / 2);
            ans = insert(ans, "(", s.length() / 2);
        }

        return ans;
    }

    static String insert(String origin, String kakko, int cnt) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.append(kakko);
        }
        if (kakko.equals(")")) {
            // 末尾に挿入
            return origin.concat(sb.toString());
        } else {
            // 先頭に挿入
            return sb.toString().concat(origin);
        }
    }

    static int countPare(String s) {
        char[] c = s.toCharArray();
        int open = 0;
        int close = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                open++;
            } else {
                close--;
            }
        }
        return open + close;
    }
}

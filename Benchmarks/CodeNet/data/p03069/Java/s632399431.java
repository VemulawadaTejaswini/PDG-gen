import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int result = solve(s);

        // 出力
        System.out.println(result);
    }

    private static int solve(String s) {
        if (!s.contains(".") || !s.contains("#")) {
            return 0;
        }
        int countWhite = s.replaceAll("[^.]", "").length();
        int countBlack = s.replaceAll("[^#]", "").length();
        int countReplace = Math.min(countWhite, countBlack);

        int count = 0;
        int left = s.indexOf("#");
        int right = s.lastIndexOf(".");
        char[] c = s.toCharArray();
        while (left < right) {
            count++;
            left++;
            while (c[left] != '#') {
                left++;
            }
            if (right <= left) {
                break;
            }
            count++;
            right--;
            while (c[right] != '.') {
                right--;
            }
        }

        return Math.min(countReplace, count);
    }
}

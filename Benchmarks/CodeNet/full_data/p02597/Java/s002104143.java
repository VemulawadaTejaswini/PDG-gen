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
        s = s.replaceAll("RW+$", "R").replaceAll("^R+W", "W");
        int n = s.length();

        int result = 0;
        if (!s.contains("R") || !s.contains("W") || !s.contains("WR")) {
            return result;
        }

        int countW = s.length() - s.replace("W", "").length();
        int countR = s.length() - s.replace("R", "").length();
        int min = Math.min(countR, countW);

        char[] c = s.toCharArray();
        int indexW = s.indexOf("W");
        int indexR = s.lastIndexOf("R");
        result++;
        while (indexR - indexW != 1 && indexW < indexR) {
            indexW++;
            while (indexW <= n - 1 && c[indexW] == 'R') {
                indexW++;
            }
            indexR--;
            while (0 <= indexR && c[indexR] == 'W') {
                indexR--;
            }
            result++;
        }

        result = Math.min(result, min);
        return result;
    }
}

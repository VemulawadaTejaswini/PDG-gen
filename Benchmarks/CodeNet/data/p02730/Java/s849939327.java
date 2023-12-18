import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String str1 = s.substring(0, (n - 1) / 2);
        String str2 = s.substring(((n + 3) - 1) / 2);
        String answer = "No";
        if (checkKaibun(s) && checkKaibun(str1) && checkKaibun(str2)) {
            answer = "Yes";
        }
        System.out.println(answer);
        sc.close();
    }

    // 文字列sを反転
    private static String reverseStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    // 文字列sが回文かどうか判定
    private static boolean checkKaibun(String s) {
        if (s.equals(reverseStr(s))) {
            return true;
        }
        return false;
    }

}

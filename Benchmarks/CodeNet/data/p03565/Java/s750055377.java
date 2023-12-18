import java.util.Scanner;

// C - Dubious Document 2
// https://atcoder.jp/contests/abc076/tasks/abc076_c
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        scanner.close();

        // 正規表現で判定するため ? を . に変換する
        S = S.replaceAll("\\?", ".");

        int length = S.length();
        int tLength =T.length();
        for (int i = 0; i < length; i++) {
            if (i + tLength > length) break;
            String regex = S.substring(i, i + tLength);
            if (T.matches(regex)) {
                S = S.replaceFirst(regex, T);
                System.out.println(S.replaceFirst(".", "a"));
                return;
            }
        }

        System.out.println("UNRESTORABLE");
    }
}

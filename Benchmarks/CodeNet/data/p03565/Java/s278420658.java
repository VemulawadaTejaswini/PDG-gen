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
        int tLength = T.length();
        for (int i = length - tLength; i >= 0; i--) {
            String regex = S.substring(i, i + tLength);
            if (T.matches(regex)) {
                S = S.replaceFirst(S.substring(0, i) + regex, S.substring(0, i) + T);
                System.out.println(S.replaceAll("\\.", "a"));
                return;
            }
        }
 
        System.out.println("UNRESTORABLE");
    }
}
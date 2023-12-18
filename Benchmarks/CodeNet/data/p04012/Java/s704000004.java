import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // 文字数が奇数の場合は絶対に条件を満たさない
        if (a.length() % 2 != 0) {
            System.out.println("No");
            return;
        }
        int cnt = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c) {
                    cnt++;
                }
            }
            if (cnt % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

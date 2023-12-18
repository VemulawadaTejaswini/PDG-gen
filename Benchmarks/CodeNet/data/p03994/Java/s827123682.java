import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int k = scanner.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (k >= '{' - s.charAt(i)) {
                k -= '{' - s.charAt(i);
                ans.append('a');
            } else {
                ans.append(s.charAt(i));
            }
        }
        ans.appendCodePoint((s.charAt(s.length() - 1) - 'a' + k) % 26 + 'a');
        System.out.println(ans);
    }
}
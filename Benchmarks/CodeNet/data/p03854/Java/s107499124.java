import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        ArrayList<String> word_list = new ArrayList(Arrays.asList("dream", "dreamer", "erase", "eraser"));

        boolean next_flg = true;
        while (next_flg) {
            next_flg = false;
            for (String word : word_list) {
                if (S.endsWith(word)) {
                    next_flg = true;
                    S = S.substring(0, S.length() - word.length());
                    break;
                }
            }
        }
        System.out.println("".equals(S) ? "YES" : "NO");
    }
}
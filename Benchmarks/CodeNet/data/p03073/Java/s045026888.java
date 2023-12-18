import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int color = 0;
        StringBuilder sb_white = new StringBuilder();
        StringBuilder sb_black = new StringBuilder();
        // 010...
        for (int i = 0; i < length; i++) {
            sb_white.append(color);
            color = color == 0 ? 1 : 0;
        }
        // 101...
        for (int i = 0; i < length; i++) {
            sb_black.append(color);
            color = color == 0 ? 1 : 0;
        }
        int white_cnt = 0;
        int black_cnt = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == sb_white.charAt(i)) {
                white_cnt++;
            }
            if (str.charAt(i) == sb_black.charAt(i)) {
                black_cnt++;
            }
        }
        System.out.println(Math.min(white_cnt, black_cnt));
    }
}

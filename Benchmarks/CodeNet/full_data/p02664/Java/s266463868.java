import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder buf = new StringBuilder();
        String line = reader.readLine();
        int linelen = line.length();
        for (int i = 0; i < linelen; i++) {
            char c = line.charAt(i);
            if (c == '?') {
                if (buf.charAt(buf.length() - 1) == 'P') {
                    // 1つ前がPならDを選択すればPD指数が1増える
                    buf.append('D');
                } else {
                    // 1つ前がP以外（=D）ならDを選択
                    // 連続するDはPD指数を1増やす
                    // ?は変換済み
                    buf.append('D');
                }
                continue;
            }
            // "P2 or "D"
            buf.append(c);
        }
        System.out.println(buf);
    }
}
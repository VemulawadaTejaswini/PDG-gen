import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String sdash = br.readLine();
            String s[] = sdash.split("");
            String t = br.readLine();
            int j = t.length() - 1;
            int index = -1;
            for (int i = sdash.length() - 1; i >= 0; i--) {
                char c = sdash.charAt(i);
                if (c == t.charAt(j)) {
                    j--;
                } else if (c == '?') {
                    j--;
                } else {
                    if (j != t.length() - 1) {
                        j = t.length() - 1;
                        i++;
                    }
                }
                if (j == -1) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = 0; i < t.length(); i++) {
                    s[i + index] = t.substring(i, i + 1);
                }
                for (int i = 0; i < s.length; i++) {
                    if ("?".equals(s[i])) {
                        System.out.print("a");
                    } else {
                        System.out.print(s[i]);
                    }
                }
                System.out.println();
            } else {
                System.out.println("UNRESTORABLE");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

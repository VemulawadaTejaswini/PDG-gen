import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int min = n;
            for (int i = 0; i < n; i++) {
                String a = str.substring(0, i);
                String b = str.substring(i + 1, n);
                int count = strCount(a, b);
                if (min > count) {
                    min = count;
                }
            }
            System.out.println(min);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int strCount(String a, String b) {
        int ret = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'W') {
                ret++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch == 'E') {
                ret++;
            }
        }
        return ret;
    }
}

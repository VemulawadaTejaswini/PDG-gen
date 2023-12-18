import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str[] = br.readLine().split(" ");
            int k = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);
            int count = 0;
            if (3 * k == s) {
                count = 1;
            } else {
                int minus = 0;
                for (int i = s; i >= 0; i--) {
                    count += minus + 1;
                    minus++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
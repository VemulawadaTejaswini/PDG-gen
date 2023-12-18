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
            int k = Integer.parseInt(br.readLine());
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (i + 1 > k) {
                    ans += y;
                } else {
                    ans += x;
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}

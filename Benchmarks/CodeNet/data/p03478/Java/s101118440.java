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
            int n = Integer.parseInt(str[0]);
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    int temp = Integer.parseInt(s.substring(j, j + 1));
                    sum += temp;
                }
                if (sum >= a && sum <= b) {
                    ans += i;
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

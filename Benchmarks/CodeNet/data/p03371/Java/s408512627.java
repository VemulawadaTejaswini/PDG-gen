import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int c = Integer.parseInt(strArr[2]);
            int x = Integer.parseInt(strArr[3]);
            int y = Integer.parseInt(strArr[4]);
            int ans = 0;
            if ((a + b) / 2 > c) {
                if (x > y) {
                    ans += c * 2 * y;
                    if (a > c * 2) {
                        ans += (x - y) * (c * 2);
                    } else {
                        ans += (x - y) * a;
                    }
                } else {
                    ans += c * 2 * x;
                    if (b > c * 2) {
                        ans += (y - x) * (c * 2);
                    } else {
                        ans += (y - x) * b;
                    }
                }
            } else {
                ans += a * x;
                ans += b * y;
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

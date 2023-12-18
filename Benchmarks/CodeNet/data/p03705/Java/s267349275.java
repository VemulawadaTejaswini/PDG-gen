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
            int n = Integer.parseInt(strArr[0]);
            int a = Integer.parseInt(strArr[1]);
            int b = Integer.parseInt(strArr[2]);
            if (a > b) {
                System.out.println(0);
            } else {
                int ans = (b - a) * (n - 2) + 1;
                if (ans > 0) {
                    System.out.println(ans);
                } else {
                    System.out.println(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
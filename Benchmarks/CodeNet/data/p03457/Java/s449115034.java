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
            int x = 0;
            int y = 0;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                String str[] = br.readLine().split(" ");
                int t = Integer.parseInt(str[0]);
                int xi = Integer.parseInt(str[1]);
                int yi = Integer.parseInt(str[2]);
                int temp = Math.abs(x - xi) + Math.abs(y - yi);
                if (temp > t) {
                    flag = false;
                    break;
                }
                if (temp % 2 == 0 && t % 2 == 0) {
                    continue;
                } else if (temp % 2 != 0 && t % 2 != 0) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

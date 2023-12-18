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

            int ans1 = a * x + b * y;

            int ans2 = 0;
            int ans3 = 0;
            if (x > y) {
                ans2 += (c * 2) * y;
                ans3 += (c * 2) * y;
                ans2 += (x - y) * a;
                ans3 += (x - y) * (c * 2);
            } else {
                ans2 += (c * 2) * x;
                ans3 += (c * 2) * x;
                ans2 += (y - x) * b;
                ans3 += (y - x) * (c * 2);
            }

            if (ans1 > ans2) {
                if (ans2 > ans3) {
                    System.out.println(ans3);
                } else {
                    System.out.println(ans2);
                }
            } else {
                if (ans1 > ans3) {
                    System.out.println(ans3);
                } else {
                    System.out.println(ans1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

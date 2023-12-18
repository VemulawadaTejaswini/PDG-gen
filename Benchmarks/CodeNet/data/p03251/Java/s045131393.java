import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String sArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(sArr[0]);
            int m = Integer.parseInt(sArr[1]);
            int x = Integer.parseInt(sArr[2]);
            int y = Integer.parseInt(sArr[3]);
            int xArr[] = new int[n];
            int xMax = -999;
            int yArr[] = new int[m];
            int yMin = 999;
            sArr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                xArr[i] = Integer.parseInt(sArr[i]);
                if (xMax < xArr[i]) {
                    xMax = xArr[i];
                }
            }
            sArr = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                yArr[i] = Integer.parseInt(sArr[i]);
                if (yMin > yArr[i]) {
                    yMin = yArr[i];
                }
            }
            boolean flag = false;
            for (int i = xMax + 1; i <= yMin; i++) {
                if (i > x && i <= y) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("No War");
            } else {
                System.out.println("War");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

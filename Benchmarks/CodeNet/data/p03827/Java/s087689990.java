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
            String s = br.readLine();
            int tmpNum = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                String tmp = s.substring(i, i + 1);
                if ("I".equals(tmp)) {
                    tmpNum++;
                    if (max < tmpNum) {
                        max = tmpNum;
                    }
                } else {
                    tmpNum--;
                }
            }
            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}